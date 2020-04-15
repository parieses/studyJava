package com.company.day07;

public class Student extends Person {
    public String school;

    public Student(String name, int age, int sex, String school) {
        super(name, age, sex);
        this.school = school;
    }

    public Student() {
        super();
    }

    @Override
    public void printInfo() {
        String info = "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", school=" + school +
                '}';
        System.out.println(info);
    }


}
