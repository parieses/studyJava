package com.company.day09;

/**
 * 会唱歌的厨子是一个老师
 */
public class SCTeacher extends PersonAbstract implements Cooking, Sing {
    String course;//科目

    @Override
    void showInfo() {
        System.out.println("SCTeacher{" +
                "course='" + course + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}');
    }

    @Override
    public void fry() {

    }

    @Override
    public void singing() {

    }
}
