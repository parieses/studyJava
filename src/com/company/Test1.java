package com.company;

import java.util.Arrays;
import java.util.List;

class Test1{
    public static void main(String[] args){
        String[] myArray = { "Apple", "Banana", "Orange" };
        List<String> myList = Arrays.asList(myArray);
        //上面两个语句等价于下面一条语句
//        List<String> myList = Arrays.asList("Apple","Banana", "Orange");
        System.out.println("myList = " + myList);
    }
}