package com.company.day15;

/**
 * 生产者和消费者
 */
public class Test3 {
    public static void main(String[] args) {
        Clerk c = new Clerk();
        //消费时不生产   生产时不消费
        //生产者
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (c) {
                    while (true) {//无限生产
                        if (Clerk.productNum == 0) {//为0开始生产
                            System.out.println("产品数量为0,开始生产");
                            while (Clerk.productNum < 4) {
                                System.out.println("库存:" + Clerk.productNum);
                                Clerk.productNum++;
                            }
                            System.out.println(Clerk.productNum + "结束生产");
                            c.notify();//唤醒消费者
                        } else {
                            try {
                                c.wait();//让生产者等待
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }, "生产者").start();
        //消费
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (c) {
                    while (true) {//无限消费
                        if (Clerk.productNum == 4) {
                            System.out.println("产品数量为4,开始消费");
                            while (Clerk.productNum > 0) {
                                System.out.println("库存:" + Clerk.productNum);
                                Clerk.productNum--;
                            }
                            System.out.println(Clerk.productNum + "结束消费");
                            c.notify();//唤醒消生产者
                        } else {
                            try {
                                c.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }, "消费者").start();
    }
}

class Clerk {
    public static int productNum = 0;
}
