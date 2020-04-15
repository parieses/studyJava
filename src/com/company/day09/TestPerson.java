package com.company.day09;

public final class TestPerson {
    final static String AB = "达瓦大"; //final static 一起修饰变量  就是全局常量
    final String AA = "吊袜带哇";//final 修饰的变量是常量  常量必须显示赋值
    int age;
    String name;
    //常量名称约定大写 多单词_ 链接 常量只能赋值一次不能改变
}
//不能被继承
//class T0 extends TestPerson {
//
//}
//final 类型的方法不能被重写