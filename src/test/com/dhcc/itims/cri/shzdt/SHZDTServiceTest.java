package com.dhcc.itims.cri.shzdt;

import com.dhcc.itims.cri.shzdt.service.SHZDTService;
import org.junit.Test;

/**
 * Created by cedo on 2016/11/28.
 */
public class SHZDTServiceTest {

    @Test
    public void allPrototypeData(){
        SHZDTService shzdtService = TestContext.testContextByXml.getBean(SHZDTService.class);
        System.out.println("=========================所有数据=================\n" + shzdtService.allData());
    }

}
