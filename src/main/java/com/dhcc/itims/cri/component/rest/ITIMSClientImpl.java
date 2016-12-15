package com.dhcc.itims.cri.component.rest;

import com.dhcc.itims.cri.component.rest.po.AlarmInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Administrator on 2016/12/14.
 * itims接口 client实现
 */
@Component
public class ITIMSClientImpl implements ITIMSClient {
    static protected final Logger log = Logger.getLogger(ITIMSClientImpl.class.getClass());

    private RestTemplate template;
    private final static String url = "http://192.168.40.128:7981//event";
    @Autowired
    public void setTemplate(RestTemplate template) {
        this.template = template;
    }

    @Override
    public boolean sendAlarm(List<AlarmInfo> alarmInfosList) {

        log.info("将要发送的事件信息: " + alarmInfosList);
        if(alarmInfosList!=null && alarmInfosList.size()>0) {
            boolean sendSuccess = false;
            int sendedCnt = 0;
            for (AlarmInfo alarmInfo : alarmInfosList) {
                String urlP = url+ "?params=" + alarmInfo.urlString();
                log.info("事件参数 :  " + urlP);
                String success = template.postForObject(urlP,
                        null, String.class);
                sendedCnt += "success".equals(success) ? 1 : 0;
                log.info("发送告警结果:" +  success);
            }
            sendSuccess = sendedCnt == alarmInfosList.size();
            return sendSuccess;
        }else {
            log.error("告警事件列表为空");
            return false;
        }
    }
}
