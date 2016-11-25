package com.dhcc.itims.cri.shzdt.extapi.po;

/**
 * Created by cedo on 2016/11/25.
 * 设备信息
 */
public class EquipInfo extends Val {

    static public final int FLAG_NORMAL = 1;    //是否启用（1，正常）
    static public final int FLAG_STOP = 0;    //是否启用（0，停用）

    private String equid;    //设备编号
    private String name;    //设备名称
    private int flag;    //是否启用（0，停用；1，正常）
    private String addr;    //分组

    public String getEquid() {
        return equid;
    }

    public void setEquid(String equid) {
        this.equid = equid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
