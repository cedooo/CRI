package com.dhcc.itims.cri.shzdt.service;

import com.dhcc.itims.cri.component.bo.DBService;
import com.dhcc.itims.cri.shzdt.dao.ProtypeData;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cedo on 2016/11/24.
 * SHZDTService接口
 */
public interface SHZDTService extends DBService {

    /**
     * 所有原始数据
     * @return 原始数据集合
     */
    public List<ProtypeData> allData();

}
