package com.dhcc.itims.cri.component.machineroom;

/**
 * Created by Administrator on 2016/11/30.
 * 机房配置信息
 */
public class MachineRoomMetaData {
    public static String MACHINE_ROOM_RULE_DEFAULT_PATH = "com/dhcc/itims/cri/component/machineroom/machineroom-rules.xml";
    private String equipmentsXml;
    private String subSystemsXml;
    private String machineRoomXml;
    private String ip;
    private String port;
    protected String connectorClass;

    public String getEquipmentsXml() {
        return equipmentsXml;
    }

    public void setEquipmentsXml(String equipmentsXml) {
        this.equipmentsXml = equipmentsXml;
    }

    public String getSubSystemsXml() {
        return subSystemsXml;
    }

    public void setSubSystemsXml(String subSystemsXml) {
        this.subSystemsXml = subSystemsXml;
    }

    public String getMachineRoomXml() {
        return machineRoomXml;
    }

    public void setMachineRoomXml(String machineRoomXml) {
        this.machineRoomXml = machineRoomXml;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getConnectorClass() {
        return connectorClass;
    }

    public void setConnectorClass(String connectorClass) {
        this.connectorClass = connectorClass;
    }

    @Override
    public String toString() {
        return "MachineRoomMetaData{" +
                "equipmentsXml='" + equipmentsXml + '\'' +
                ", subSystemsXml='" + subSystemsXml + '\'' +
                ", machineRoomXml='" + machineRoomXml + '\'' +
                ", ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                ", connectorClass='" + connectorClass + '\'' +
                '}';
    }
}
