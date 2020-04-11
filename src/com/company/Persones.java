package com.company;

public class Persones {
    //类里面可以提前声明 卜旭艳初始化
    String name; // 默认值null 实例变量  只能在类的实例化中使用
    int age;//0
    public static String sex = "男";//不通过实例化课直接使用 类变量

    /**
     * 打印姓名
     */
    public void showName(){
        System.out.println(name);
    }

    /**
     * 返回年龄
     * @return age
     */
    public int getAge(){
        return age;
    }
}
