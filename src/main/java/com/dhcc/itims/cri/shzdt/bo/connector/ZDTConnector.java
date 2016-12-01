package com.dhcc.itims.cri.shzdt.bo.connector;

import com.dhcc.itims.cri.component.connector.CRIConnector;
import com.dhcc.itims.cri.component.machineroom.MachineRoom;
import com.dhcc.itims.cri.component.machineroom.MachineRoomBuilder;
import com.dhcc.itims.cri.component.machineroom.element.NetworkElement;
import com.dhcc.itims.cri.shzdt.extapi.CmdFactory;
import com.dhcc.itims.cri.shzdt.extapi.po.ParameterValue;
import com.dhcc.itims.cri.shzdt.service.SHZDTService;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2016/11/27.
 * 与socket接口连接
 */
@Component("com.dhcc.itims.cri.shzdt.bo.connector.ZDTConnector")
public class ZDTConnector extends CRIConnector  {
    static private Logger log = Logger.getLogger(ZDTConnector.class.getClass());
    private Socket socket;
    private MachineRoomBuilder machineRoomBuilder;
    private SHZDTService shzdtService;

    @Autowired
    public void setShzdtService(SHZDTService shzdtService) {
        this.shzdtService = shzdtService;
    }

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
           Thread reciver =  new Thread(new Reciver(socket.getInputStream()));
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

    @PreDestroy
    @Override
    protected boolean stop() {
        log.info("断开接口连接:" + this.toString());
        this.stopSend = true;
        try {
            this.socket.close();
        } catch (IOException e) {
            log.warn("断开接口连接出现异常:" + e);
        }
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


    /**
     * 测试解析字符串
     * TODO 应该删除
     * @param args
     */
    public static void main(String[] args){
        String strValue = "{\"cmd\":6004,\"flg\":0,\"rst\":1,\"seq\":38,\"val\":[{\"date\":\"2016-12-01 11:16:09.000\",\"paid\":\"W1102001\",\"state\":0,\"value\":22.50},{\"date\":\"2016-12-01 11:16:09.000\",\"paid\":\"W1102002\",\"state\":0,\"value\":31.39999961853027}],\"ver\":1}";
        if(strValue.length()>0) {
            JSONObject jsnObj = new JSONObject(strValue);
            JSONArray jsonArray = (JSONArray) jsnObj.get("val");
            int cmd = jsnObj.getInt("cmd");
            if (6004 == cmd) {
                Iterator<Object> iterator = jsonArray.iterator();
                List<ParameterValue> listParaValue = new ArrayList<ParameterValue>();
                while (iterator.hasNext()) {
                    JSONObject jsnPara = (JSONObject) iterator.next();
                    ParameterValue parameterValue = new ParameterValue();
                    parameterValue.setDate(jsnPara.getString("date"));
                    parameterValue.setValue(jsnPara.getDouble("value"));
                    parameterValue.setState(jsnPara.getInt("state"));
                    parameterValue.setPaid(jsnPara.getString("paid"));
                    listParaValue.add(parameterValue);
                }
                log.info(listParaValue);

            }
        }else{
            //do nothing
        }
    }
    class Reciver implements Runnable{
        private BufferedReader inSock;
        public Reciver(InputStream inputStream){
            inSock =new BufferedReader(new InputStreamReader(inputStream));
        }
        @Override
        public void run() {
            try{
                String strValue = inSock.readLine();
                while(strValue!=null){
                    log.info("recv:");
                    log.info(strValue);
                    try {
                        if(strValue.length()>0) {
                            JSONObject jsnObj = new JSONObject(strValue);
                            JSONArray jsonArray = (JSONArray) jsnObj.get("val");
                            int cmd = jsnObj.getInt("cmd");
                            if (6004 == cmd) {
                                Iterator<Object> iterator = jsonArray.iterator();
                                List<ParameterValue> listParaValue = new ArrayList<ParameterValue>();
                                while (iterator.hasNext()) {
                                    JSONObject jsnPara = (JSONObject) iterator.next();
                                    ParameterValue parameterValue = new ParameterValue();
                                    parameterValue.setDate(jsnPara.getString("date"));
                                    parameterValue.setValue(jsnPara.getDouble("value"));
                                    parameterValue.setState(jsnPara.getInt("state"));
                                    parameterValue.setPaid(jsnPara.getString("paid"));
                                    listParaValue.add(parameterValue);
                                }
                                log.info(listParaValue);
                                shzdtService.persistenceParameterValue(listParaValue);
                            }
                        }else{
                            //do nothing
                        }
                    }catch (JSONException e){
                        log.warn("返回对象错误:\n" + e );
                    }catch (Exception e){
                        log.warn(e);
                    }
                    strValue = inSock.readLine();
                }

            }catch(Exception e){
                log.warn(e);
            }finally {
                try {
                    stopSend = true;
                    inSock.close();
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
                    log.info("===================数据库中所有实时数据====================");
                    log.info(shzdtService.allParameterValue());
                    log.info("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
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

