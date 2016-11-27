package com.dhcc.itims.cri.shzdt.bo;

import com.dhcc.itims.cri.component.connector.CRIConnector;
import org.apache.log4j.Logger;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/11/27.
 */
@Component
public class ZDTConnector extends CRIConnector {
    static private Logger log = Logger.getLogger(ZDTConnector.class.getClass());

    public static String ip;
    public static int port ;


    @Override
    public void run() {

    }

}
