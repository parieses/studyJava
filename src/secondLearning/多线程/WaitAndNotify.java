package secondLearning.多线程;

/*
    等待唤醒案例 :线程间的通信
        创建一个顾客线程(消费者) :告知要包子 和数量 然后调用wait方法等待
        创建老板线程(生产者) 话五秒做好包子 调用notify 唤醒顾客吃包子
 */
public class WaitAndNotify {


    public static void main(String[] args) {
        Object obj = new Object();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    synchronized (obj) {
                        System.out.println("我要包子");
                        try {
                            obj.wait();//唤醒之后执行代码
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("吃包子");
                        System.out.println("**********************");
                    }
                }
            }

        }.start();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("生产包子");
                        obj.notify();//唤醒
                    }
                }
            }
        }.start();
    }
}
