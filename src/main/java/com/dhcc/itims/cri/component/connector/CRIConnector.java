package com.dhcc.itims.cri.component.connector;

import com.dhcc.itims.cri.component.bo.DBService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2016/11/26.
 * 连接器， 是各种API接口对应的client
 * 可能是socket接口/
 */
public abstract class CRIConnector implements Runnable{
    protected String code = null;    //公司编码
    protected DBService dbService;

    public String getCode() {
        return code;
    }

    public CRIConnector(){
        this.setCode();
    }
    @Autowired
    public void setDbService(DBService dbService) {
        this.dbService = dbService;
    }


    protected abstract void setCode();
    protected abstract boolean stop();
    protected abstract boolean valid();
}
