package com.dhcc.itims.cri.shzdt.extapi.po;

/**
 * Created by cedo on 2016/11/25.
 */
public class EquipParameter extends Val {
    private String eqid;    //设备编号
    private String paid;    //参数编号
    private String name;    //参数名称
    private String unit;    //单位

    public String getEqid() {
        return eqid;
    }

    public void setEqid(String eqid) {
        this.eqid = eqid;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
