package com.dhcc.itims.cri.shzdt.extapi.po;

import java.util.List;

/**
 * Created by cedo on 2016/11/25.
 * [上海业高智能科技有限公司(V3.0)] 厂家接口数据包
 */
public class Pkg {
    private int cmd;
    private int ver;
    private int seq;
    private int flg;
    private int rst;
    private List<Val> val;

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
