package com.company.day15;

public class TestRunnable implements Runnable {
    static int count = 0;

    @Override
    public void run() {
        System.out.println("多线程运行的代码");
        for (int i = 0; i < 100; i++) {
            count++;
            System.out.println(count + Thread.currentThread().getName() + "这是Runnable多线程逻辑代码" + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("___________________________");
    }
}
