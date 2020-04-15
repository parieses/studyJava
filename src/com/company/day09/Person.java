package com.company.day09;

public class Person {
    //静态代码块
    static {
        //这里只能使用静态修饰的属性或者方法
        System.out.println("执行静态代码块");
    }

    //TODO:1先初始化类属性 (默认初始化和显示初始化)
    String name;

    //TODO:2执行代码块代码
    //非静态的代码块   代码块按顺序执行
    {
        System.out.println("执行非静态代码块");
    }

    //TODO:3执行构造器代码
    public Person() {
        this.name = "张三";
        System.out.println("执行构造函数");
    }

}
