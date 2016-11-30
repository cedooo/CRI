package com.dhcc.itims.cri.component.job;

import com.dhcc.itims.cri.component.connector.CRIConnector;
import com.dhcc.itims.cri.component.connector.ConnectorService;
import com.dhcc.itims.cri.component.job.CRIJob;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by cedo on 2016/11/28.
 */
@Component
public class CheckConnectorAliveJob extends CRIJob  {
    private ApplicationContext applicationContext;
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        log.info("检查接口连接状态");
        ConnectorService connectorService = applicationContext.getBean(ConnectorService.class);
        boolean checkResult = connectorService.checkConnectorState();
        log.info("检查结果：接口连接" + (checkResult?"正常":"出现异常(更多信息，请查看日志。)"));
    }

    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
