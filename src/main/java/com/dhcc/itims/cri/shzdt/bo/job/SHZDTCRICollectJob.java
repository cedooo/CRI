package com.dhcc.itims.cri.shzdt.bo.job;

import com.dhcc.itims.cri.component.job.CRICollectJob;
import com.dhcc.itims.cri.component.machineroom.MachineRoom;
import com.dhcc.itims.cri.component.machineroom.MachineRoomBuilder;
import com.dhcc.itims.cri.shzdt.service.SHZDTService;
import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2016/11/26.
 * 执行采集任务
 * 与 SHZDTService,ConnectorService 在同一概念层级上
 */
@Component
public class SHZDTCRICollectJob extends CRICollectJob {
    private static Logger log = Logger.getLogger(SHZDTCRICollectJob.class.getClass());
    private SHZDTService shzdtService;
    private MachineRoomBuilder machineRoomBuilder;
    @Autowired
    public void setMachineRoomBuilder(MachineRoomBuilder machineRoomBuilder) {
        this.machineRoomBuilder = machineRoomBuilder;
    }

    @Autowired
    public void setShzdtService(SHZDTService shzdtService) {
        this.shzdtService = shzdtService;
    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.debug(jobExecutionContext);
        log.info("===============执行机房数据采集任务===============");
        log.info(jobInfo(jobExecutionContext));
        String machineId = (String) jobExecutionContext.getMergedJobDataMap().get("machineId");
        MachineRoom machineRoom = machineRoomBuilder.getMachineRoomById(machineId);
        log.info(machineRoom);
        //TODO 调用接口获取数据 并转存到数据库中
        log.info(shzdtService.allData());
    }

}
