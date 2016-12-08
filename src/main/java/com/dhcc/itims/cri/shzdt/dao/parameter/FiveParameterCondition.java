package com.dhcc.itims.cri.shzdt.dao.parameter;

/**
 * Created by Administrator on 2016/12/7.
 * mybatis参数为两个时传入的参数对象
 */
public class FiveParameterCondition {
    private long id;
    private String one;
    private String two;
    private String three;
    private String four;
    private String five;

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

    public String getThree() {
        return three;
    }

    public void setThree(String three) {
        this.three = three;
    }

    public String getFour() {
        return four;
    }

    public void setFour(String four) {
        this.four = four;
    }

    public String getFive() {
        return five;
    }

    public void setFive(String five) {
        this.five = five;
    }

    @Override
    public String toString() {
        return "FiveParameterCondition{" +
                "id=" + id +
                ", one='" + one + '\'' +
                ", two='" + two + '\'' +
                ", three='" + three + '\'' +
                ", four='" + four + '\'' +
                ", five='" + five + '\'' +
                '}';
    }
}
