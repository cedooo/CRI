package com.dhcc.itims.cri.shzdt.service;

import com.dhcc.itims.cri.shzdt.dao.parameter.FiveParameterCondition;
import com.dhcc.itims.cri.shzdt.dao.parameter.FourParameterCondition;
import com.dhcc.itims.cri.shzdt.dao.ProtypeData;
import com.dhcc.itims.cri.shzdt.dao.parameter.TwoParameterCondition;
import com.dhcc.itims.cri.shzdt.extapi.po.ParameterValue;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cedo on 2016/11/28.
 * 提供与数据库相关的操作
 * 与SHZDTCRICollecctJob,SHZDTService在同一概念层级上
 */
@Component("SHZDTService")
public class SHZDTServiceImpl implements SHZDTService{
    private SqlSessionFactory sqlSessionFactory;
    @Autowired
    public void setSqlSession(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public int persistenceParameterValue(List<ParameterValue> parameterValueList) {
        SqlSession sess = sqlSessionFactory.openSession(true);
        int insertCount = 0;
        try{
            for(ParameterValue parameterValue: parameterValueList) {
                insertCount += sess.update("com.dhcc.itims.cri.shzdt.saveParmeterValue", parameterValue);
            }
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
        }finally{
            if(sess!=null){
                sess.commit();
                sess.close();
            }
        }
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
        }finally{
            if(sess!=null){
                sess.commit();
                sess.close();
            }
        }
    }
}
