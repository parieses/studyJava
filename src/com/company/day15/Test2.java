package com.company.day15;

public class Test2 {
    public static void main(String[] args) {
        Account account = new Account();
        Thread weChar = new Thread(new User(account, 2000), "微信");
        Thread alPay = new Thread(new User(account, 1000), "支付宝");
        weChar.start();
        alPay.start();
    }
}

class Account {
    public static int money = 3000;

    //同步锁来完成控制金额为负数 synchronized
    //在普通方法上家同步锁 锁的是整个对象不是某个方法  不同的对象不同的锁
    //静态方法加锁 所以方法都是使用同一个对象 静态方法锁类 静态方法锁实例
    public synchronized void drawString(int m) {
//        synchronized(this){//表示当前对象的代码块被加了同步锁
        //特点代表当前对象都是一个同步锁
//
//        }
//        synchronized(a){} //传递进来的同步锁
        String name = Thread.currentThread().getName();
        if (name.equals("微信")) {
            try {
                this.wait();//当前线程进入等待状态
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (money >= m) {
            System.out.println(name + "账户原有金额:" + money);
            System.out.println(name + "取款金额:" + m);
            money = money - m;
            System.out.println(name + "取款后余额:" + money);
        } else {
            System.out.println("余额不足:" + money);
        }
        if (name.equals("支付宝")) {
            this.notify();//唤醒当前优先级最高的线程进入就绪状态
//            account.notifyAll();//唤醒所有进入就绪
        }
    }
}

class User implements Runnable {
    Account account;
    int money;

    public User(Account account, int money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        account.drawString(money);
    }
}
