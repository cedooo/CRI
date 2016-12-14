package com.dhcc.itims.cri.shzdt.service;

import com.dhcc.itims.cri.component.rest.ITIMSService;
import com.dhcc.itims.cri.component.rest.po.AlarmInfo;
import com.dhcc.itims.cri.shzdt.dao.parameter.FiveParameterCondition;
import com.dhcc.itims.cri.shzdt.dao.parameter.TwoParameterCondition;
import com.dhcc.itims.cri.shzdt.extapi.po.ParameterValue;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cedo on 2016/11/28.
 * 提供与数据库相关以及底层业务相关的操作
 * 与SHZDTCRICollecctJob,SHZDTService在同一概念层级上
 */
@Component("SHZDTService")
public class SHZDTServiceImpl implements SHZDTService{
    static protected final Logger log = Logger.getLogger(SHZDTServiceImpl.class.getClass());

    private SqlSessionFactory sqlSessionFactory;
    @Autowired
    public void setSqlSession(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    private ITIMSService itimsService;

    @Autowired
    public void setItimsService(ITIMSService itimsService) {
        this.itimsService = itimsService;
    }

    @Override
    public int persistenceParameterValue(List<ParameterValue> parameterValueList) {
        SqlSession sess = sqlSessionFactory.openSession(true);
        int insertCount = 0;
        try{
            for(ParameterValue parameterValue: parameterValueList) {
                insertCount += sess.update("com.dhcc.itims.cri.shzdt.saveParmeterValue", parameterValue);
            }
        }catch (Exception e){
            log.warn(e);
        }finally{
            if(sess!=null){
                sess.commit();
                sess.close();
            }
        }
        return insertCount;
    }

    @Override
    public long insertNewRow(TwoParameterCondition parameters) {
        SqlSession sess = sqlSessionFactory.openSession(true);
        try{
            int insertCnt = sess.insert("com.dhcc.itims.cri.shzdt.insertNewRow", parameters);
            sess.commit();
            return insertCnt==1?parameters.getId():0l;
        }catch (Exception e){
            log.warn(e);
        }finally{
            if(sess!=null){
                sess.commit();
                sess.close();
            }
        }
        return -1;
    }

    @Override
    public int updateTableValue(List<FiveParameterCondition> listFP) {
        SqlSession sess = sqlSessionFactory.openSession(ExecutorType.BATCH, false);
        try{
            int updatedCnt = 0;
            for (FiveParameterCondition fp:
                    listFP) {
                updatedCnt+= sess.update("com.dhcc.itims.cri.shzdt.updateParameterValue", fp);
            }
            sess.commit();
            return updatedCnt;
        }catch (Exception e){
            log.warn(e);
        }finally{
            if(sess!=null){
                sess.commit();
                sess.close();
            }
        }
        return -1;
    }

    @Override
    public int deleteOutdatedData(long outdatedSecond) {
        SqlSession sess = sqlSessionFactory.openSession(true);
        try{
            int deletedCnt = sess.delete("com.dhcc.itims.cri.shzdt.deleteOutdatedRawData", outdatedSecond);
            sess.commit();
            return deletedCnt;
        }catch (Exception e){
            log.warn(e);
        }finally{
            if(sess!=null){
                sess.commit();
                sess.close();
            }
        }
        return -1;
    }

    @Override
    public boolean sendAlarmToITIMS(List<AlarmInfo> alarmInfoList) {
        if(alarmInfoList!=null && alarmInfoList.size()>0) {
            /**
             * 通过设备唯一编号 查找在Itims系统的Mosn等信息
             */
            SqlSession sess = sqlSessionFactory.openSession(true);
            try{
                for (AlarmInfo alarm: alarmInfoList) {
                    String mosn = sess.selectOne("com.dhcc.itims.cri.shzdt.selectMosnByCode", alarm.getEquipCode());
                    sess.commit();
                    alarm.setMosn(mosn);
                }
            }catch (Exception e){
                log.warn(e);
            }finally{
                if(sess!=null){
                    sess.commit();
                    sess.close();
                }
            }
            return itimsService.sendAlarm(alarmInfoList);
        }else {
            return false;
        }
    }
}
