package com.dhcc.itims.cri.component.machineroom;

import org.junit.Test;

/**
 * Created by Administrator on 2016/11/30.
 */
public class MachineRoomBuilderTest {
    @Test
    public void build(){
        String[] machineRoomXml = {"shzdt/machineRoomDefinition/machineroom.xml"};
        System.out.println(new MachineRoomBuilder(machineRoomXml).getMachineRooms());
    }
}
