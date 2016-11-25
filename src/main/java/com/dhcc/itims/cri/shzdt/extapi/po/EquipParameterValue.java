package com.dhcc.itims.cri.shzdt.extapi.po;

/**
 * Created by cedo on 2016/11/25.
 * 参数值
 */
public class EquipParameterValue extends Val{
    private String paid;    //参数编号
    private String date;    //日期时间
    private double value;    //参数值
    private int state;    //状态（0,正常;1,高报警;2,低报警;3,高预警;4,低预警;）

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
