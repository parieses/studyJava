package com.company.day07;

public class Person {
    public String name;
    public int age;
    public int sex;

    public Person(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {

    }

    public void printInfo() {
        String info = "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
        System.out.println(info);
    }

    public String getName() {
        return name;
    }
}
