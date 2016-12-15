package com.dhcc.itims.cri.component.rest;

import com.dhcc.itims.cri.component.rest.po.AlarmInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by cedo on 2016/12/15.
 * 测试向itims发送告警
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("restContext.xml")
public class ITIMSClientTest {

    @Autowired
    private ITIMSClient itimsClient;

    @Autowired()
    private AlarmInfo alarmInfo;
    @Test(timeout = 4000L)
    public void testSendAlarmToITIMS(){
        List<AlarmInfo> alarmInfoList = new ArrayList<AlarmInfo>();
        alarmInfo.setOccurtime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        alarmInfoList.add(alarmInfo);
        assertEquals(itimsClient.sendAlarm(alarmInfoList), false);
    }
}
