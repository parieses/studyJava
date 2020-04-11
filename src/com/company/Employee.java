package com.company;

import java.io.*;

public class Employee {
    String name;//姓名
    int age;//年龄
    String designation;//职位
    double salary;//金额

    // Employee 类的构造器
    public Employee(String name) {
        this.name = name;
    }

    //设置年龄
    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /* 打印信息 */
    public void printEmployee() {
        System.out.println("名字:" + name);
        System.out.println("年龄:" + age);
        System.out.println("职位:" + designation);
        System.out.println("薪水:" + salary);
    }
}