package com.company.day15;

/**
 * 继承Thread类实现多线程
 */
public class TestThread extends Thread {
    @Override
    public void run() {
        System.out.println("多线程运行的代码");
        for (int i = 0; i < 10; i++) {
            System.out.println("这是多线程逻辑代码" + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("___________________________");
    }
}
