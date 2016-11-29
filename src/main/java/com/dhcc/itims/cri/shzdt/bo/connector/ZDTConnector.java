package com.dhcc.itims.cri.shzdt.bo.connector;

import com.dhcc.itims.cri.component.connector.CRIConnector;
import com.dhcc.itims.cri.component.machineroom.MachineRoom;
import com.dhcc.itims.cri.component.machineroom.factory.JobXmlConfig;
import com.dhcc.itims.cri.component.machineroom.factory.MachineRoomFactory;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by Administrator on 2016/11/27.
 */
@Component(value = "zdtConnector")
public class ZDTConnector extends CRIConnector {
    static private Logger log = Logger.getLogger(ZDTConnector.class.getClass());

    public String ip = null;
    public int port = -1;


    @Override
    public void run() {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        init();
        //TODO 连接接口获取原始数据,并存入数据库中
        log.info("创建接口连接线程" + ip + ":" + port);
        try {
            Thread.sleep(555555);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void init(){

        Set<MachineRoom> machineRooms = MachineRoomFactory.getMachineRooms();
        for (MachineRoom machineRoom :
                machineRooms) {
            JobXmlConfig jobXmlConfig = machineRoom.getJobXmlConfig();
            if(this.code.equals(jobXmlConfig.getCode())){
                log.debug(jobXmlConfig);
                String addr = jobXmlConfig.getConnecorAddr();
                log.info(addr);
                try {
                    if (addr != null)
                        addr = addr.trim();
                    if (addr.matches("^.*:\\d*$")) {
                        String[] addrs = addr.split(":");
                        this.ip = addrs[0];
                        this.port = Integer.parseInt(addrs[1]);
                    } else {
                        log.error("连接外部接口配置网络地址错误:" + addr);
                    }
                }catch (Exception e){
                    log.error(e);
                }
                break;
            }else{continue;}
        }
    }

    @Override
    protected void setCode() {
        this.code = "ZDT";
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
}
