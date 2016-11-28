package com.dhcc.itims.cri.shzdt.dao;

/**
 * Created by cedo on 2016/11/28.
 */
public class ProtypeData {

    private String id,
    parameterCode,
    parameterName,
    value,
    unit,
    state,
    alarmTop,
    alarmBottom,
    alertTop,
    alertBottom,
    collectTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParameterCode() {
        return parameterCode;
    }

    public void setParameterCode(String parameterCode) {
        this.parameterCode = parameterCode;
    }

    public String getParameterName() {
        return parameterName;
    }

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAlarmTop() {
        return alarmTop;
    }

    public void setAlarmTop(String alarmTop) {
        this.alarmTop = alarmTop;
    }

    public String getAlarmBottom() {
        return alarmBottom;
    }

    public void setAlarmBottom(String alarmBottom) {
        this.alarmBottom = alarmBottom;
    }

    public String getAlertTop() {
        return alertTop;
    }

    public void setAlertTop(String alertTop) {
        this.alertTop = alertTop;
    }

    public String getAlertBottom() {
        return alertBottom;
    }

    public void setAlertBottom(String alertBottom) {
        this.alertBottom = alertBottom;
    }

    public String getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(String collectTime) {
        this.collectTime = collectTime;
    }

    @Override
    public String toString() {
        return "ProtypeData{" +
                "id='" + id + '\'' +
                ", parameterCode='" + parameterCode + '\'' +
                ", parameterName='" + parameterName + '\'' +
                ", value='" + value + '\'' +
                ", unit='" + unit + '\'' +
                ", state='" + state + '\'' +
                ", alarmTop='" + alarmTop + '\'' +
                ", alarmBottom='" + alarmBottom + '\'' +
                ", alertTop='" + alertTop + '\'' +
                ", alertBottom='" + alertBottom + '\'' +
                ", collectTime='" + collectTime + '\'' +
                '}';
    }
}
