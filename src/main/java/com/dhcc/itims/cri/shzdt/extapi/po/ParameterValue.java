package com.dhcc.itims.cri.shzdt.extapi.po;

/**
 * Created by cedo on 2016/11/25.
 * 参数值
 */
public class ParameterValue extends Val {
    private String id;    //id
    private String paid;    //参数编号
    private String padate;    //日期时间
    private String pavalue;    //参数值
    private String pastate;    //状态（0,正常;1,高报警;2,低报警;3,高预警;4,低预警;）

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getPadate() {
        return padate;
    }

    public void setPadate(String padate) {
        this.padate = padate;
    }

    public String getPavalue() {
        return pavalue;
    }

    public void setPavalue(String pavalue) {
        this.pavalue = pavalue;
    }

    public String getPastate() {
        return pastate;
    }

    public void setPastate(String pastate) {
        this.pastate = pastate;
    }

    @Override
    public String toString() {
        return "ParameterValue{" +
                "paid='" + paid + '\'' +
                ", padate='" + padate + '\'' +
                ", pavalue='" + pavalue + '\'' +
                ", pastate='" + pastate + '\'' +
                '}';
    }
}
