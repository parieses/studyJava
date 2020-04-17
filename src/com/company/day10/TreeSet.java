package com.company.day10;

import java.util.Comparator;
import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        //自然排序
        Set<Integer> set = new java.util.TreeSet<Integer>();
        set.add(4);
        set.add(1);
        set.add(43);
        System.out.println(set);
        Person p1 = new Person(20, "1111");
        Person p2 = new Person(43, "2222");
        Person p3 = new Person(33, "3333");
        Set<Person> Pset = new java.util.TreeSet<Person>(new Person());
        Pset.add(p1);
        Pset.add(p2);
        Pset.add(p3);
        for (Person person : Pset) {
            System.out.println(person.toString());
        }

    }
}

//定制排序
class Person implements Comparator<Person> {//把person 对象存到 treeSet 中按年龄排序
    int age;
    String name;

    public Person() {

    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compare(Person o1, Person o2) {//年龄正序排列
        return Integer.compare(o1.age, o2.age);
    }

}
