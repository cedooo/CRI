package com.dhcc.itims.cri.component.webservice;

import com.dhcc.itims.cri.component.webservice.po.AlarmInfo;

import java.util.List;

/**
 * Created by Administrator on 2016/12/14.
 * itims的相关接口client
 */
public interface ITIMSService {
    /**
     * 向ITIMS系统发送告警信息
     * @param alarmInfosList 告警信息集合
     */
    public  boolean sendAlarm(List<AlarmInfo> alarmInfosList);
}
