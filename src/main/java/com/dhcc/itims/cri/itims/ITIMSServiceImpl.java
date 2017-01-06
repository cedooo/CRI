package com.dhcc.itims.cri.itims;

import com.dhcc.itims.cri.component.rest.ITIMSClient;
import com.dhcc.itims.cri.component.rest.po.AlarmInfo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by cedo on 2017/1/6.
 * ITIMS 相关service
 */
@Component
public class ITIMSServiceImpl implements ITIMSService {
    static protected final Logger log = Logger.getLogger(ITIMSServiceImpl.class.getClass());

    private SqlSessionFactory sqlSessionFactory;
    @Autowired
    public void setSqlSession(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
    private ITIMSClient itimsClient;

    @Autowired
    public void setItimsClient(ITIMSClient itimsClient) {
        this.itimsClient = itimsClient;
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
            return itimsClient.sendAlarm(alarmInfoList);
        }else {
            return false;
        }
    }
}
