package com.dhcc.itims.cri.shzdt.dao.parameter;

/**
 * Created by Administrator on 2016/12/7.
 * mybatis参数为两个时传入的参数对象
 */
public class TwoParameterCondition   {
    private long id;
    private String one;
    private String two;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    @Override
    public String toString() {
        return "TwoParameterCondition{" +
                "id=" + id +
                ", one='" + one + '\'' +
                ", two='" + two + '\'' +
                '}';
    }
}
