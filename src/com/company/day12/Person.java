package com.company.day12;

import java.io.Serializable;

public class Person implements Serializable {
    /**
     * 一个表示序列化版本标识的静态变量
     * 用来表明不同版本间的兼容性
     */
    private static final long serialVersionUID = 1L;
    String name;
    int age;
}
