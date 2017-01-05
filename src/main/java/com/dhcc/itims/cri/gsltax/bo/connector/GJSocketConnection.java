package com.dhcc.itims.cri.gsltax.bo.connector;

import com.dhcc.itims.cri.component.connector.CRIConnector;

/**
 * Created by cedo on 2017/1/5.
 * 共济接口连接
 */
public class GJSocketConnection extends CRIConnector {

    protected volatile boolean keepRun = false;
    @Override
    protected boolean stop() {
        this.keepRun = false;
        return keepRun==false;
    }

    @Override
    protected boolean valid() {
        return keepRun;
    }

    @Override
    public void run() {
        this.keepRun = false;

    }
}
