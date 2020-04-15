package com.company.day08;

/**
 * 实现一个懒汉式的单例
 */
public class Single1 {
    //在私有化本类型的类变量
    private static Single1 single1 = null;

    //先私有化构造方法
    private Single1() {

    }

    public static Single1 getInstance() {
        if (single1 == null) {
            single1 = new Single1();
        }
        return single1;
    }
}

