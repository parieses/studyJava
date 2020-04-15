package com.company.day08;

public class Chinese {
    public static int count;
    //类变量不用实例化 直接类名.属性名就可以是类的一部分 ,被所有这个类的实例化所共有
    static String countryName;
    //实例变量 只有实例化知之后才能使用 属于实例化的一部分
    String name;
    int age;

    public Chinese() {
        count++;
    }

    public static void test() {
        System.out.println("这是一个静态方法");
    }

    public static void show() {
        System.out.println("new了" + count + "次对象");
    }

}
