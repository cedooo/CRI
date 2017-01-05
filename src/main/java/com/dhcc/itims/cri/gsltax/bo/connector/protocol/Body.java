package com.dhcc.itims.cri.gsltax.bo.connector.protocol;

import java.util.regex.Pattern;

public class Body {
    static public int GROUP_SIZE_LENGTH = 2;    //组长度占字节数
    //数据 正则表达式
    static public Pattern keyValuePttern = Pattern.compile("^[A-Z]\\d{1,}(-[A-Z]\\d{1,}){1,}\\|\\d((\\.)\\d){0,1}$");    //S0-E1-ST|1
    
}
