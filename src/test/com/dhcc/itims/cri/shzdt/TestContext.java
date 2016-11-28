package com.dhcc.itims.cri.shzdt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cedo on 2016/11/7.
 * test context for junit test
 */
public class TestContext {


    //static public ApplicationContext helloXXXContextByAnnotation = new AnnotationConfigApplicationContext(HelloXXXConfig.class);

    static public ApplicationContext testContextByXml = new ClassPathXmlApplicationContext(
            new String[]{"testContext.xml"}
    );

}
