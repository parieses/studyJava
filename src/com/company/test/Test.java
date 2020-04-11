package com.company.test;

//使用同一个包名下的类 import可以不写
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
//        p.age = -100;//程序是对的但是不符合逻辑
        //把类的属性开放出来 让调用者随意使用 会有问题
        p.setAge(-100);
        p.PrintAge();
        int x = -10;
        assert x >= 0;
        System.out.println(x);
    }
}
