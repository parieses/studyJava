package com.company.day15;

public class Test {
    /*
     * 电脑cpu的核数
     * 几核的cpu 就代表同一瞬时时间能处理的任务数
     * 主频 高频率切换程序
     */
    //进程相当于一一条河
    //线程相当于河流分支
    public static void main(String[] args) {
        //继承thread类的线程 从写run方法
        Thread t = new TestThread();
//        t.start();//启动线程
        System.out.println("!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!");
        System.out.println("!!!!!!!!!!!!!!!!");
        Thread t1 = new TestThread();
//        //Runnable 实现run方法 一般使用这个
        TestRunnable runnable = new TestRunnable();
        Thread t2 = new Thread(runnable);
        t2.start();
        Thread t3 = new Thread(runnable, "_t3");
        t3.start();
        Runnable r1 = new TestRunnable();
        r1.run();
    }
}
