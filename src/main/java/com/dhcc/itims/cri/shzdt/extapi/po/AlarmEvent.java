package com.dhcc.itims.cri.shzdt.extapi.po;

/**
 * Created by cedo on 2016/11/25.
 * 报警事件信息
 */
public class AlarmEvent extends Val {
    private String eqid;    //设备编号
    private String name;    //设备名称
    private String enid;    //事件编号
    private String info;    //事件名称
    private int level;    //事件级别（0，紧急报警；1，一般故障；2，提示信息）
    private int type;    //事件类型（0，发生报警；1，解除报警）
    private String date;    //日期时间

    public String getEqid() {
        return eqid;
    }

    public void setEqid(String eqid) {
        this.eqid = eqid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnid() {
        return enid;
    }

    public void setEnid(String enid) {
        this.enid = enid;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
