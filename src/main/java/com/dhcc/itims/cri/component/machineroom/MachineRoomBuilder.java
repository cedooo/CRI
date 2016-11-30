package com.dhcc.itims.cri.component.machineroom;

import com.dhcc.itims.cri.component.machineroom.element.NetworkElement;
import com.dhcc.itims.cri.component.machineroom.element.equipment.Equipment;
import com.dhcc.itims.cri.component.machineroom.element.subsystem.SubSystem;
import org.apache.commons.digester3.Digester;
import org.apache.commons.digester3.binder.DigesterLoader;
import org.apache.commons.digester3.xmlrules.FromXmlRulesModule;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

/**
 * Created by Administrator on 2016/11/30.
 * 创建机房列表
 */
public class MachineRoomBuilder {
    static private Logger log = Logger.getLogger(MachineRoomBuilder.class.getClass());
    static private Set<MachineRoom> listMachineRoom = new HashSet<MachineRoom>();

    public static void main(String[] args){
        String[] machineRoomXml = {"com/dhcc/itims/cri/shzdt/bo/machineroom/machineroom.xml"};
        System.out.println(new MachineRoomBuilder(machineRoomXml).getMachineRooms());
    }
    public  MachineRoomBuilder(String[] machineRoomXmls){
        for (int i = 0; i < machineRoomXmls.length; i++) {
            listMachineRoom.add(this.getMachineRoom(machineRoomXmls[i]));
        }
    }
    public MachineRoom getMachineRoomById(String id){
        if(id==null||id.length()==0){
            return null;
        }
        Iterator<MachineRoom> iterator = listMachineRoom.iterator();
        while(iterator.hasNext()){
            MachineRoom machineRoom= iterator.next();
            if(id.equals(machineRoom.getId())){
                return machineRoom;
            }else{
                continue;
            }
        }
        return null;
    }

    private MachineRoom getMachineRoom(String machineRoomXml){
        MachineRoom machineRoom = null;
        InputStream input = null;
        try {
            DigesterLoader digesterLoader = DigesterLoader.newLoader(new BXmlRules(MachineRoomMetaData.MACHINE_ROOM_RULE_DEFAULT_PATH));
            Digester digester = digesterLoader.newDigester();
            input = MachineRoomBuilder.class.getClassLoader().getResourceAsStream(machineRoomXml);
            machineRoom = digester.parse(input);
            MachineRoomMetaData machineRoomMetaData = machineRoom.getMachineRoomMetaData();
            log.debug(machineRoom);
            /*
             * 设备
			 */
            Map<String, String[]> mapNetworkEle = mapNetworkEleXml(machineRoomMetaData.getEquipmentsXml()); //网元 map<'定义规则xml'， 定义xml[]>
            List<NetworkElement> listEquipment = new ArrayList<NetworkElement>();
            for (Map.Entry<String, String[]> maps : mapNetworkEle.entrySet()) {
                DigesterLoader rulesLoader = DigesterLoader.newLoader(new BXmlRules(maps.getKey()));
                String[] vals = maps.getValue();
                Digester equipDigester = rulesLoader.newDigester();
                for (String val : vals) {
                    log.debug("设备定义xml>>>" + val.trim() + "<<<<<<<");
                    input = MachineRoomBuilder.class.getClassLoader().getResourceAsStream(val.trim());
                    NetworkElement networkElement = equipDigester.parse(input);
                    log.debug(networkElement);
                    boolean defValid = networkElement != null;
                    if (defValid) {
                        //所有网元设备
                        List<NetworkElement> networkElementList = machineRoom.getNetworkElementList();
                        for (NetworkElement ne2 : networkElementList) {
                            if (ne2.getType().equals(networkElement.getType())) {
                                networkElement.setId(ne2.getId());
                                networkElement.setName(ne2.getName());
                                listEquipment.add(networkElement.deepClone());
                                log.debug("克隆的对象成功添加到网元列表中");
                            }
                        }
                    }

                }
            }

			/*
			 * 子系统
			 */
            List<NetworkElement> listSubSys = new ArrayList<NetworkElement>();
            Map<String, String[]> mapSubSystem = mapSubSystemXml(machineRoomMetaData.getSubSystemsXml());
            for (Map.Entry<String, String[]> maps : mapSubSystem.entrySet()) {
                DigesterLoader rulesLoader = DigesterLoader.newLoader(new BXmlRules(maps.getKey()));
                String[] vals = maps.getValue();
                Digester equipDigester = rulesLoader.newDigester();
                for (String val : vals) {
                    log.debug("子系统定义xml>>>" + val.trim() + "<<<<<");
                    input = MachineRoomBuilder.class.getClassLoader().getResourceAsStream(val.trim());
                    SubSystem subDef = equipDigester.parse(input);
                    log.debug("子系统定义: " + subDef);
                    boolean defValid = subDef != null;
                    if (defValid) {
                        //子系统 设备节点 处理：加入到设备中
                        List<Equipment> listSubEquip = subDef.getListEquip();
                        List<Equipment> listSubEquipDef = subDef.getListEquipDef();

                        for (Equipment equipment : listSubEquip) {
                            for (Equipment equipmentDef : listSubEquipDef) {
                                if (equipment.getType() != null && equipment.getType().equals(equipmentDef.getType())) {
                                    equipment.setGroupSet(((Equipment) equipmentDef.deepClone()).getGroupSet());
                                    equipment.setModeset(((Equipment) equipmentDef.deepClone()).getModeset());
                                    break;
                                } else {
                                    continue;
                                }
                            }
                        }

                        List<NetworkElement> listSubSystem = machineRoom.getNetworkElementList();
                        log.debug("机房子系统列表：" + listSubSystem);
                        for (NetworkElement sys : listSubSystem) {
                            if (sys.getType().equals(subDef.getType())) {
                                subDef.setId(sys.getId());
                                subDef.setName(sys.getName());
                                listSubSys.add(subDef.deepClone());
                            }
                        }
                    }
                }
            }
            machineRoom.getNetworkElementList().clear();
            machineRoom.getNetworkElementList().addAll(listEquipment);
            machineRoom.getNetworkElementList().addAll(listSubSys);
            //log.info("机房信息==>" + machineRoom);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return machineRoom;
    }

    public  Set<MachineRoom> getMachineRooms() {
        return listMachineRoom;
    }

    private static Map<String, String[]> mapNetworkEleXml(String strXml){
        Map<String, String[]> mapNetworkEleXml = new HashMap<String, String[]>();
        String neworkElementXml = strXml;
        if(neworkElementXml!=null&& neworkElementXml.length() > 3){//&&neworkElementXml.trim().matches(XML_REGEX)) {
            String[] xmlGroups = neworkElementXml.trim().split(";");
            for (String string : xmlGroups) {
                String[] sa = string.trim().split(":");
                String rules = sa[0].trim();
                String[]  defs = sa[1].split(",");
                mapNetworkEleXml.put(rules, defs);
            }
        }
        return mapNetworkEleXml;
    }
    private static Map<String, String[]> mapSubSystemXml(String strXml){
        Map<String, String[]> mapSubSystemXml = new HashMap<String, String[]>();
        String subSystemXml = strXml;
        log.debug("加载子系统xml = " + subSystemXml);
        if(subSystemXml!=null&& subSystemXml.length() > 3){//&&neworkElementXml.trim().matches(XML_REGEX)) {
            String[] xmlGroups = subSystemXml.trim().split(";");
            for (String string : xmlGroups) {
                String[] sa = string.trim().split(":");
                String rules = sa[0].trim();
                String[]  defs = sa[1].split(",");
                mapSubSystemXml.put(rules, defs);
            }
        }
        return mapSubSystemXml;
    }

}

class BXmlRules extends FromXmlRulesModule {
    private String xmlPath = null;

    public BXmlRules(String xmlPath) {
        this.xmlPath = xmlPath.trim();
    }

    @Override
    protected void loadRules() {
        InputStream input = MachineRoomBuilder.class.getClassLoader().getResourceAsStream(xmlPath);
        this.loadXMLRules(input);
    }

}