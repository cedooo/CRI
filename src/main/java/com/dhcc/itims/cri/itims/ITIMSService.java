package com.dhcc.itims.cri.itims;

import com.dhcc.itims.cri.component.rest.po.AlarmInfo;

import java.util.List;

/**
 * Created by cedo on 2017/1/6.
 */
public interface ITIMSService {

    /**
     * 向itims系统发送告警信息
     * @param alarmInfoList 告警信息集合
     * @return 成功发送返回true，否则返回false
     */
    public boolean sendAlarmToITIMS(List<AlarmInfo> alarmInfoList);
}
