package com.dhcc.itims.cri.component.job;

import com.dhcc.itims.cri.component.machineroom.MachineRoom;
import com.dhcc.itims.cri.component.machineroom.element.NetworkElement;
import com.dhcc.itims.cri.component.machineroom.factory.MachineRoomFactory;
import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2016/11/26.
 */
@Component
public class CommonCRICollectJob extends CRICollectJob {
    private static Logger log = Logger.getLogger(CommonCRICollectJob.class.getClass());

    private JobExecutionContext jobExecutionContext;
    private MachineRoom machineRoom;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.debug(jobExecutionContext);
        String info = printJobInfo(jobExecutionContext);
        MachineRoom machineRoom = MachineRoomFactory.getMachineRoomInstance(jobExecutionContext);
        log.info(info + machineRoom);
    }



    public JobExecutionContext getJobExecutionContext() {
        return jobExecutionContext;
    }

    public void setJobExecutionContext(JobExecutionContext jobExecutionContext) {
        this.jobExecutionContext = jobExecutionContext;
    }

    public MachineRoom getMachineRoom() {
        return machineRoom;
    }

    @Autowired
    public void setMachineRoom(MachineRoom machineRoom) {
        this.machineRoom = machineRoom;
    }
}
