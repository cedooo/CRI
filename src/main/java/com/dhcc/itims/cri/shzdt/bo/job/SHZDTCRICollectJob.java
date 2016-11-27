package com.dhcc.itims.cri.shzdt.bo.job;

import com.dhcc.itims.cri.component.job.CRICollectJob;
import com.dhcc.itims.cri.component.machineroom.MachineRoom;
import com.dhcc.itims.cri.component.machineroom.factory.MachineRoomFactory;
import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created by Administrator on 2016/11/26.
 */
public class SHZDTCRICollectJob extends CRICollectJob {
    private static Logger log = Logger.getLogger(SHZDTCRICollectJob.class.getClass());

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.debug(jobExecutionContext);
        MachineRoom machineRoom = MachineRoomFactory.getMachineRoomInstance(jobExecutionContext);
        log.info(jobInfo(jobExecutionContext) + machineRoom);
        //TODO 调用接口获取数据 并转存到数据库中
    }

}
