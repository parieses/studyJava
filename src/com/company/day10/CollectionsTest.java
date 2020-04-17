package com.company.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("q");
        list.add("q12");
        list.add("q31");
        list.add("31q");
        list.add("31q");
        System.out.println(list);
        Collections.reverse(list);//数组元素翻转
        System.out.println(list);
        Collections.shuffle(list);//随机排序
        Collections.sort(list);//升序排列
        Collections.swap(list, 0, 2);//两个位置的数值进行替换
        Collections.max(list);//最大值
        Collections.frequency(list, "31q");//出现次数
        Collections.replaceAll(list, "31q", "22222");
        System.out.println(list);
        Student s1 = new Student("11", 12);
        Student s2 = new Student("112", 122);
        Student s3 = new Student("121", 1232);
        Student s4 = new Student("211", 132);
        List<Student> students = new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        for (Student student : students) {
            System.out.println(student.age);
        }
        //两种写法 根据Comparator排序
        students.sort(new Student());
//        Collections.sort(students, new Student());
        for (Student student : students) {
            System.out.println(student.age);
        }
        System.out.println(Collections.max(students, new Student()).age);

    }
}

class Student implements Comparator<Student> {
    int age;
    String name;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.age, o2.age);
    }
}
