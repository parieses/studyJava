package com.company.day14;

public class Student extends Person implements Move, Study {
    String school;
    private String test;

    private Student(String name, int age, String school) {
        super(name, age);
        System.out.println("私有构造");
        this.school = school;
    }

    public Student(String school) {
        super("name", 12);
        System.out.println("有参数构造函数");
        this.school = school;
    }

    Student() {
        System.out.println("无参构造函数");
    }

    public void showInfo() {
        System.out.println(school);
    }

    @Override
    public void moveType() {
        System.out.println("骑车");
    }

    @Override
    public void studyInfo() {
        System.out.println("学习中学知识");
    }

    private void test(String name) {
        System.out.println(" 这是私有方法test");
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
        System.out.println("这是setSchool");
    }
}
