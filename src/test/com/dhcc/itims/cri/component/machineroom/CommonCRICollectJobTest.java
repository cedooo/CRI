package com.dhcc.itims.cri.component.machineroom;

import org.junit.Test;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created by Administrator on 2016/11/26.
 */
public class CommonCRICollectJobTest {

    //@Test
    public void exe(){
        try {
            Scheduler sch = new StdSchedulerFactory("shzdt/quartz.properties").getScheduler();
            sch.start();
            try {
                Thread.sleep(100*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
