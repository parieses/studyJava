package com.company.day08;

public class Wrapper {
    public static void main(String[] args) {
        Integer i = 111;//自动封箱
        String s = "121231";
        int j = i.intValue(); //拆箱
        //字符串转基本类型
        int ii = Integer.parseInt("123"); //字符串转 int
        float f = Float.parseFloat("12.32");
        s = String.valueOf(ii);
        s = String.valueOf(f);
    }

}
