package com.dhcc.itims.cri.component.connector;

/**
 * Created by Administrator on 2016/11/26.
 * 连接器， 是各种API接口对应的client
 * 可能是socket接口/
 */
public abstract class CRIConnector implements Runnable{
    protected String code = null;    //公司编码
    protected abstract void setCode();

    public String getCode() {
        return code;
    }

    public CRIConnector(){
        this.setCode();
    }
}
