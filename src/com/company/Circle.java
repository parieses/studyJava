package com.company;

import java.util.Arrays;

/**
 * 计算圆的面积
 */
public class Circle {
    private double Pi = 3.1415926;

    /**
     * @param r 半径
     * @return area
     */
    public double area(double r) {
        return this.Pi * Math.pow(r, 2);
    }

    //多个相同方法想在一个类中共存 一定是参数不同
    //这样的同名方法就叫做重载
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    //测试
    public void mOl(int a) {
        System.out.println(Math.pow(a, 2));
    }

    public void mOl(int a, int b) {
        System.out.println(a * b);
    }
    public void mOl(String str) {
        System.out.println(str);
    }
    public void test(String ...str){
        System.out.println(Arrays.toString(str));
    }
    public void test1(String[] str){
        System.out.println(Arrays.toString(str));
    }
    public void test(int i,String ...str){
        System.out.println(Arrays.toString(str));
    }
}
