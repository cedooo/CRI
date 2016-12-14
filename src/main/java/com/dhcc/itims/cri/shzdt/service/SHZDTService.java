package com.dhcc.itims.cri.shzdt.service;

import com.dhcc.itims.cri.component.bo.DBService;
import com.dhcc.itims.cri.component.rest.po.AlarmInfo;
import com.dhcc.itims.cri.shzdt.dao.parameter.FiveParameterCondition;
import com.dhcc.itims.cri.shzdt.dao.parameter.TwoParameterCondition;
import com.dhcc.itims.cri.shzdt.extapi.po.ParameterValue;

import java.util.List;

/**
 * Created by cedo on 2016/11/24.
 * SHZDTService接口
 */
public interface SHZDTService extends DBService {


    public int persistenceParameterValue(List<ParameterValue> parameterValueList);


    //begin

    /**
     * 向表中插入新的一行
     * @return 插入行的id
     */
    public long insertNewRow(TwoParameterCondition parameters);

    /**
     * 更新表中值
     * @param listFP 参数队列
     * @return 受影响行数
     */
    public int updateTableValue(List<FiveParameterCondition> listFP);

    /**
     * 删除过期的数据
     * @return 已删除的过期数据的行数
     */
    public int deleteOutdatedData(long outdatedSecond);

    /**
     * 向itims系统发送告警信息
     * @param alarmInfoList 告警信息集合
     * @return 成功发送返回true，否则返回false
     */
    public boolean sendAlarmToITIMS(List<AlarmInfo> alarmInfoList);
    //end

}
