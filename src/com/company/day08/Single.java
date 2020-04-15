package com.company.day08;

/**
 * 实现一个饿汉式的单例
 */
public class Single {
    //私有的Single类型的类变量
    private static Single single = new Single();

    //    public Single() {
//        //假设构造方法中执行1000行艾迪玛 ,耗时10 s
//        //每一次 new Single 对象需要10s 运行1000 行代码
//        //像这种情况 就适合单例模式, 只new 一次
//        //使用
//
//        单例模式解决  一般new对象太费劲  或者频繁 new新的对象
//    }
    //构造方法私有化
    Single() {

    }

    public static Single getInstance() {
        return single;
    }
}
