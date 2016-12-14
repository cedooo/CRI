package com.dhcc.itims.cri.shzdt.bo.job;

import com.dhcc.itims.cri.component.bo.DBService;
import com.dhcc.itims.cri.component.connector.ConnectorService;
import com.dhcc.itims.cri.component.job.CRIJob;
import com.dhcc.itims.cri.shzdt.service.SHZDTService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by cedo on 2016/11/28.
 */
@Component
public class DeleteOutdatedRawDataJob extends CRIJob {
    private SHZDTService dbService;

    @Autowired
    public void setDbService(SHZDTService dbService) {
        this.dbService = dbService;
    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("删除过期的原始数据");
        try {
            String outdatedSecond = jobExecutionContext.getMergedJobDataMap().getString("outdatedSecond");
            long outdatedSecondLong = Long.parseLong(outdatedSecond);
            int deletedCnt = dbService.deleteOutdatedData(outdatedSecondLong);
            log.info("删除过期(" + outdatedSecondLong + "秒之前)的原始采集数据 : " + deletedCnt + "行");
        }catch (NumberFormatException e){
            log.warn("删除过期原始数据时发生异常:" + e);
        }
    }


}
