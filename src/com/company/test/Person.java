package com.company.test;

public class Person {
    //    public int age;//把类的属性开放出来 让调用者随意使用 会有问题
    //我们需要对这样不能让调用者随意使用的进行封装和隐藏
    private int age;

    public void PrintAge() {
        System.out.println(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        }
        System.out.println("年龄异常");
    }
}
