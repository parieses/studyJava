package com.company.day09;

public class Test {
    public static void main(String[] args) {
        //静态代码块只执行一次 非静态代码块 每次new  都会执行
//        Person p = new Person();
//        Person p1 = new Person();
        /*
         * 执行静态代码块
         * 执行非静态代码块
         * 执行构造函数
         * 执行非静态代码块
         * 执行构造函数
         */

        //匿名内部类
        //这种类 没有类名 这种就可以用代码块   用代码块代替构造
        Person p2 = new Person() {
            {
                name = "历史";
            }
        };
        System.out.println(p2.name);
    }
}
