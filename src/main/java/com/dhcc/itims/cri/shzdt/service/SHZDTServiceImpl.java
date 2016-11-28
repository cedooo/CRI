package com.dhcc.itims.cri.shzdt.service;

import com.dhcc.itims.cri.shzdt.dao.ProtypeData;
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

    public List<ProtypeData> allData(){
        SqlSession sess = sqlSessionFactory.openSession(true);
        List<ProtypeData> listCountry = new ArrayList<ProtypeData>();
        try{
            List<ProtypeData> listCountryDB = sess.selectList("com.dhcc.itims.cri.shzdt.selectAllData");
            if(listCountryDB!=null && listCountryDB.size()>0){
                listCountry.addAll(listCountryDB);
            }
        }finally{
            if(sess!=null){
                sess.commit();
                sess.close();
            }
        }
        return listCountry;
    }
}
