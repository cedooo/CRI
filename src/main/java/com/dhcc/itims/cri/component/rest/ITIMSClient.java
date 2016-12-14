package com.dhcc.itims.cri.component.rest;

import com.dhcc.itims.cri.component.rest.po.AlarmInfo;

import java.util.List;

/**
 * Created by Administrator on 2016/12/14.
 * itims的相关接口client
 */
public interface ITIMSClient {
    /**
     * 向ITIMS系统发送告警信息
     * @param alarmInfosList 告警信息集合
     */
    public  boolean sendAlarm(List<AlarmInfo> alarmInfosList);
}
