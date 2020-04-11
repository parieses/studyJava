package com.company.test;

//属性私有化
//一个javaBean
public class JavaBean {
    private int sex;
    private String name;
    private int age;

    public JavaBean(int sex, String name, int age) {
        this.sex = sex;
        this.name = name;
        this.age = age;
    }

    public JavaBean() {
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
