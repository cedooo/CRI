package com.dhcc.itims.cri.shzdt.bo.job;

import com.dhcc.itims.cri.component.job.CRICollectJob;
import com.dhcc.itims.cri.component.machineroom.MachineRoom;
import com.dhcc.itims.cri.component.machineroom.MachineRoomBuilder;
import com.dhcc.itims.cri.component.machineroom.element.NetworkElement;
import com.dhcc.itims.cri.component.machineroom.element.equipment.Equipment;
import com.dhcc.itims.cri.component.machineroom.element.equipment.EquipmentNode;
import com.dhcc.itims.cri.component.machineroom.element.equipment.Group;
import com.dhcc.itims.cri.shzdt.dao.parameter.FiveParameterCondition;
import com.dhcc.itims.cri.shzdt.dao.parameter.FourParameterCondition;
import com.dhcc.itims.cri.shzdt.dao.parameter.TwoParameterCondition;
import com.dhcc.itims.cri.shzdt.service.SHZDTService;
import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

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

        List<NetworkElement> networkElementList = machineRoom.getNetworkElementList();
        for (NetworkElement ne:
             networkElementList) {
            log.info(ne);
            Equipment eq = (Equipment)ne;
            List<Group> groupSet = eq.getGroupSet();

            String equipCode = eq.getId();
            List<String> listSql = new ArrayList<String>();
            for (Group group:
                 groupSet) {
                String tableName = group.getRefTab();
                boolean needCollect = "1".equals(group.getCollect());
                String valueColumn = "0".equals(group.getType())?"pastate":"pavalue";

                if(tableName!=null && tableName!=null &&
                        needCollect) {

                    //插入不含数据值的记录 然后插入数据值
                    TwoParameterCondition twoPC = new TwoParameterCondition();
                    twoPC.setOne(tableName);
                    twoPC.setTwo(equipCode);

                    log.debug(twoPC);
                    long newRowID = shzdtService.insertNewRow(twoPC);
                    log.info("插入的行id = " + newRowID);
                    if(newRowID>0) {
                        List<FiveParameterCondition> listParams = new ArrayList<FiveParameterCondition>();
                        List<EquipmentNode> equipNodeList = group.getListNode();
                        for (EquipmentNode equipmentNode :
                                equipNodeList) {
                            FiveParameterCondition fiveParam = new FiveParameterCondition();
                            fiveParam.setOne(tableName);
                            fiveParam.setTwo(equipmentNode.getRef());
                            fiveParam.setThree(valueColumn);
                            fiveParam.setFour(ne.getId() + equipmentNode.getId());
                            fiveParam.setFive(newRowID+"");
                            listParams.add(fiveParam);
                        }
                        log.debug("更新熟悉数量 [" + listParams.size() + "] 参数 = " + listParams);
                        int updateCnt = shzdtService.updateTableValue(listParams);
                        log.info("更新数据影响条数:" + updateCnt);
                    }else{
                        //log.info("采集数据出错:在向表【" + tableName +"】中插入数据时候出现错误.参数为:" + twoPC);
                        log.info("采集数据时， 不存在数据");
                    }

                }else{
                    log.info("放弃采集设备:\n" + ne);
                }
            }


        }


       /* log.info("~~~~~~~~~~~~~~~~~~~~~~~~");
        List<ParameterValue> list = shzdtService.allParameterValue();
        log.info("参数值 : \n" + list);*/

    }

}
