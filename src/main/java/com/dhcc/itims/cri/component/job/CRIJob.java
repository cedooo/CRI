package com.dhcc.itims.cri.component.job;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/11/26.
 * cri任务父类
 */
public abstract class CRIJob implements Job {

    /**
     * 打印采集基本信息
     * @param content job执行上下文
     */
    static public String jobInfo(JobExecutionContext content){
        JobDetail detail = content.getJobDetail();
        StringBuffer info = new StringBuffer("\n===================采集作业信息==================\n");
        info.append("描述:" + detail.getDescription() + "\n"
                + "时间:"+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()).toString());
        return info.toString();
    }
}
