package com.company.test;

public class ThisTest {
    int age;
    String name;

    //无法区分age是形参还是当前的age成员变量
    public ThisTest(int age, String name) {
        this();//必须放在构造器首行
        this.age = age;
        this.name = name;
    }

    public ThisTest(int age) {
        this("张三");
    }

    public ThisTest(String name) {
    }

    public ThisTest() {

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName1(String name) {
        this.setName(name);
    }
}
