package com.dhcc.itims.cri.component.webservice.po;

/**
 * Created by Administrator on 2016/12/14.
 * 告警信息pojo
 *
 * 发送告警必要的参数有：
 * 设备号（mosn）:itims系统内部会将所有设备编号处理统一使用这个编号可以在tcmo表中获取,
 * 附加信息（addinfo）没有特殊区别一般为空，
 * 告警原因（cause）告警产生的原因可以在tfcausecatalog表中获取，
 * 原始信息（origininfo）没有特殊一般为空，
 * 告警详情（detail）详细描述告警发生的设备情况具体参数，
 * 发生时间（occurtime）告警发生的时间，
 * 告警级别（severity）从1到5告警严重程度逐步提升，
 * 告警状态（status）为发生清除2种状态。
 *
 * 其中设备号，告警原因，发生时间，级别（1-5），状态（发生或清除）不能为空。
 * 各个字段的长度为：mosn 数字9位，
 * addinfo，cause，origininfo，detail 都是字符512位，
 * 告警状态只能是发生或者清除，
 * 发生时间是时间格式(ISO-8601)"2014-06-05 12:34:21"这样，
 * severity数字1位1到5
 */
public class AlarmInfo {

    private String equipCode;    //第三方系统 设备唯一id

    private String mosn;
    private String addinfo;
    private String cause;
    private String origininfo;
    private String detail;
    private String occurtime;
    private String serverity;
    private String status;


    public String getEquipCode() {
        return equipCode;
    }

    public void setEquipCode(String equipCode) {
        this.equipCode = equipCode;
    }

    public String getMosn() {
        return mosn;
    }

    public void setMosn(String mosn) {
        this.mosn = mosn;
    }

    public String getAddinfo() {
        return addinfo;
    }

    public void setAddinfo(String addinfo) {
        this.addinfo = addinfo;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getOrigininfo() {
        return origininfo;
    }

    public void setOrigininfo(String origininfo) {
        this.origininfo = origininfo;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getOccurtime() {
        return occurtime;
    }

    public void setOccurtime(String occurtime) {
        this.occurtime = occurtime;
    }

    public String getServerity() {
        return serverity;
    }

    public void setServerity(String serverity) {
        this.serverity = serverity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AlarmInfo{" +
                "equipCode='" + equipCode + '\'' +
                ", mosn='" + mosn + '\'' +
                ", addinfo='" + addinfo + '\'' +
                ", cause='" + cause + '\'' +
                ", origininfo='" + origininfo + '\'' +
                ", detail='" + detail + '\'' +
                ", occurtime='" + occurtime + '\'' +
                ", serverity='" + serverity + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
