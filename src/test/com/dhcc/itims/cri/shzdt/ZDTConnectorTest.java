package com.dhcc.itims.cri.shzdt;

import com.dhcc.itims.cri.shzdt.bo.connector.ZDTConnector;
import org.junit.Test;

/**
 * Created by Administrator on 2016/11/30.
 */
public class ZDTConnectorTest {

    //@Test
    public void testConnect(){
        ZDTConnector zdtConnector = new ZDTConnector();
        zdtConnector.setIp("192.168.0.101");
        zdtConnector.setPort(8001);
        new Thread(zdtConnector).start();
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
