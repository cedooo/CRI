package com.dhcc.itims.cri.shzdt.bo.job;

import com.dhcc.itims.cri.component.job.CRIJob;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

/**
 * Created by cedo on 2016/11/28.
 */
@Component
public class CheckConnectorAliveJob extends CRIJob {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

    }
}
