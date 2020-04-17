package com.company.day09;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;

public class ArraysTest2 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 4, 25, 16, 30, 18};
        // 对数组arr1进行并发排序
        Arrays.parallelSort(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[]{13, -4, 25, 16, 30, 18};
        Arrays.parallelPrefix(arr2, new IntBinaryOperator() {
            // left 代表数组中前一个索引处的元素，计算第一个元素时，left为1
            // right代表数组中当前索引处的元素
            //{1*3=3, 3*-4=-12, -12*25=-300, -300*16=—48000, -48000*30=—144000, -144000*18=-2592000}
            public int applyAsInt(int left, int right) {
                return left * right;
            }
        });
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[5];
        Arrays.parallelSetAll(arr3, new IntUnaryOperator() {
            // operand代表正在计算的元素索引
            public int applyAsInt(int operand) {
                return operand * 5;
            }
        });
        System.out.println(Arrays.toString(arr3));
        //Arrays 类提供了一个 fill() 方法，可以在指定位置进行数值填充
        int[] number = new int[5];
        System.out.println("number —共有 " + number.length + " 个元素，它们分别是：");
        for (int i = 0; i < number.length; i++) {
            Arrays.fill(number, i);
            System.out.println("number[" + i + "]=" + i);
        }
        double[] score = {99.5, 100, 98, 97.5, 100, 95, 85.5, 100};
        Arrays.sort(score);
        int index1 = Arrays.binarySearch(score, 100);
        int index2 = Arrays.binarySearch(score, 60);
        System.out.println("查找到 100 的位置是：" + index1);
        System.out.println("查找到 60 的位置是：" + index2);
        double[] score1 = {99.5, 100, 98, 97.5, 100, 95, 85.5, 100};
        Arrays.sort(score);
        int index11 = Arrays.binarySearch(score, 2, 6, 100);
        int index22 = Arrays.binarySearch(score, 2, 6, 60);
        System.out.println("查找到 100 的位置是：" + index11);
        System.out.println("查找到 60 的位置是：" + index22);
    }
}
