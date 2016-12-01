package com.dhcc.itims.cri.component.connector;

import com.dhcc.itims.cri.component.bo.DBService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2016/11/26.
 * 连接器， 是各种API接口对应的client
 * 可能是socket接口/
 */
public abstract class CRIConnector implements Runnable{
    protected String machineRoomId = null;    //公司编码
    protected String ip = null;
    protected int port = -1;



    public CRIConnector(){

    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getMachineRoomId() {
        return machineRoomId;
    }

    public void setMachineRoomId(String machineRoomId) {
        this.machineRoomId = machineRoomId;
    }

    /**
     * 断开连接
     * @return 断开成功返回true，否则返回false
     */
    protected abstract boolean stop();

    /**
     * 检查连接是否有效
     * @return 连接有效返回true，否则返回false
     */
    protected abstract boolean valid();
}
