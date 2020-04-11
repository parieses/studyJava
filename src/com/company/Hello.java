package com.company;

public class Hello{
    int age;
    public static void main(String[] args) {
        System.out.println("Hello");
        Hello pt = new Hello();
        pt.sout("Hollis");//实际参数为 Hollis
    }
    public void sout(String name) { //形式参数为 name
        System.out.println(name);
     }

}