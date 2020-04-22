package com.company.day15;

public class Test1 {
    public static void main(String[] args) {
        TestRunn run = new TestRunn();
        TestRunn run1 = new TestRunn();
        Thread t = new Thread(run);
        Thread t1 = new Thread(run1);
        t.start();
//        t1.setName("达瓦大");
        t1.start();
        System.out.println(t.getName());
        //线程的优先级 那个线程有较大的概率被执行
        // 优先级  用数字1-10 数字越大优先级越高 如果没有设置 默认是5
//        t1.setPriority(10);
        System.out.println(t1.getPriority());//获取优先级
        System.out.println("______________1");
        System.out.println(t1.isAlive());//判断线程是否存活

        try {
            //阻塞当前的main方法
            t1.join(); //相当于在这块吧run代码插入执行同步的
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.isAlive());
        System.out.println("______________2");
        System.out.println("______________3");
    }
}

class TestRunn implements Runnable {
    int count;

    @Override
    public void run() {
        System.out.println("Runnable多线程运行的代码");
        for (int i = 0; i < 10; i++) {
            count++;
            System.out.println(count + Thread.currentThread().getName() + "这是Runnable多线程逻辑代码" + i);
            if (i % 2 == 0) {
                Thread.yield();//线程让步
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
