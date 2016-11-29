package com.dhcc.itims.cri.shzdt.extapi.po;

import java.util.List;

/**
 * Created by cedo on 2016/11/25.
 * [上海业高智能科技有限公司(V3.0)] 厂家接口数据包
 */
public class Pkg {
    private int cmd;
    private int ver = 1;
    private int seq = 1;
    private int flg = 1;
    private int rst = 1;
    private List<Val> val = null;

    public static final int CMD_EQUIPS = 6001;
    public static final int CMD_EQUIP_PARAS = 6002;
    public static final int CMD_EQUIP_STATE = 6003;
    public static final int CMD_EQUIP_PARAS_VALUE = 6004;
    public static final int CMD_PARA_VALUE = 6005;
    public static final int CMD_ALARM = 6006;

    public int getCmd() {
        return cmd;
    }

    public void setCmd(int cmd) {
        this.cmd = cmd;
    }

    public int getVer() {
        return ver;
    }

    public void setVer(int ver) {
        this.ver = ver;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public int getFlg() {
        return flg;
    }

    public void setFlg(int flg) {
        this.flg = flg;
    }

    public int getRst() {
        return rst;
    }

    public void setRst(int rst) {
        this.rst = rst;
    }

    public List<Val> getVal() {
        return val;
    }

    public void setVal(List<Val> val) {
        this.val = val;
    }
}
