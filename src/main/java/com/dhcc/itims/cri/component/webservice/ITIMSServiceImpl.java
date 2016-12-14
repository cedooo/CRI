package com.dhcc.itims.cri.component.webservice;

import com.dhcc.itims.cri.component.webservice.po.AlarmInfo;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2016/12/14.
 * itims接口 client实现
 */
@Component
public class ITIMSServiceImpl implements ITIMSService {
    static protected final Logger log = Logger.getLogger(ITIMSServiceImpl.class.getClass());
    @Override
    public boolean sendAlarm(List<AlarmInfo> alarmInfosList) {

        log.info("将要发送的事件信息: " + alarmInfosList);

        return false;
    }
}
