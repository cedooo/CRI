package com.dhcc.itims.cri.shzdt;

import com.dhcc.itims.cri.shzdt.extapi.CmdFactory;
import org.junit.Test;

/**
 * Created by cedo on 2016/11/29.
 * 测试cmdFactory
 */
public class CmdFactoryTest {


    @Test
    public void cmds(){
        CmdFactory.equipmentListRequest();
        CmdFactory.equipmentAllParametersRequest("L1101");
        CmdFactory.equipmentStateRequest("L1101");
        CmdFactory.equipmentParametersValRequest("L1101");
        CmdFactory.parametersValRequest("L1101");
        CmdFactory.alarmInfoRequest();
    }
}
