package com.dhcc.itims.cri.shzdt.bo.connector;

import com.dhcc.itims.cri.component.connector.CRIConnector;
import com.dhcc.itims.cri.component.machineroom.MachineRoom;
import com.dhcc.itims.cri.component.machineroom.MachineRoomBuilder;
import com.dhcc.itims.cri.component.machineroom.element.NetworkElement;
import com.dhcc.itims.cri.shzdt.extapi.CmdFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/27.
 * 与socket接口连接
 */
@Component("com.dhcc.itims.cri.shzdt.bo.connector.ZDTConnector")
public class ZDTConnector extends CRIConnector {
    static private Logger log = Logger.getLogger(ZDTConnector.class.getClass());
    private Socket socket;
    private MachineRoomBuilder machineRoomBuilder;
    @Autowired
    public void setMachineRoomBuilder(MachineRoomBuilder machineRoomBuilder) {
        this.machineRoomBuilder = machineRoomBuilder;
    }

    @Override
    public void run()  {
        this.stopSend = false;
        log.info("创建接口连接线程" + ip + ":" + port);
        try {
            this.socket = new Socket(ip, port);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> listCmdStr = getCmdsFromMachineRoom(machineRoomBuilder.getMachineRoomById(this.getMachineRoomId()));
        try {
           Thread reciver =  new Thread(new Recive(socket.getInputStream()));
            reciver.start();
            Thread sender = new Thread(new Sender(socket.getOutputStream(), listCmdStr));
            sender.start();
            //sender.join();
            reciver.join();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            try {
                if(socket!=null){
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private List<String> getCmdsFromMachineRoom(MachineRoom machineRoom){
        if(machineRoom!=null){
            List<NetworkElement> networkElementList = machineRoom.getNetworkElementList();
            List<String> cmdList = new ArrayList<String>();
            for (NetworkElement networkElement:networkElementList) {
                cmdList.add(CmdFactory.equipmentParametersValRequest(networkElement.getId()));
            }

            return cmdList ;
        }
        return null;
    }

    @Override
    protected boolean stop() {
        log.info("断开接口连接:" + this.toString());
        return false;
    }

    @Override
    protected boolean valid() {
        return false;
    }

    @Override
    public String toString() {
        return "ZDTConnector{" +
                "ip='" + ip + '\'' +
                ", port=" + port +
                '}';
    }
    class Recive implements Runnable{
        private BufferedReader inSock;
        public Recive(InputStream inputStream){
            inSock =new BufferedReader(new InputStreamReader(inputStream));
        }
        @Override
        public void run() {
            try{
                String strValue = inSock.readLine();
                while(strValue!=null){
                    log.info("recv:");
                    log.info(strValue);
                    strValue = inSock.readLine();
                }
                stopSend = true;

            }catch(Exception e){

            }finally {
                try {
                    socket.close();
                    log.warn("socket连接断开:" + socket);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    private volatile boolean stopSend = false;

    class Sender implements Runnable{
        private  PrintWriter outSock = null;
        private List<String> listCmds;
        public Sender(OutputStream outputStream, List<String> listCmds){
            outSock = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)), true);
            this.listCmds = listCmds;
        }
        @Override
        public void run() {
            try {
                while (!stopSend) {
                    for (String strCmd : listCmds) {
                        log.info("send:" + strCmd);
                        outSock.println(strCmd);
                        outSock.flush();
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    try {
                        Thread.sleep(10 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }finally {
                outSock.close();
            }
        }
    }
}

