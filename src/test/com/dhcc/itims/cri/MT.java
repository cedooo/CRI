package com.dhcc.itims.cri;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2016/12/8.
 */
public class MT {
    public static void main(String[] args){
        double value = 42.29999923706055;
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        System.out.println(decimalFormat.format(0));

        String date = "2016-12-08 14:24:54.000";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            System.out.println(sdf.format(sdf.parse(date)));
        } catch (ParseException e) {
            e.printStackTrace();
        }


        String s = "清除";
        try {
            System.out.println(URLEncoder.encode(s,"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


}
