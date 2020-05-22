package secondLearning.多线程;

/**
 * 进入TimeWaiting(计时等待)的两种方式
 * 1.使用sleep(long m)方法 在毫秒值结束后 线程进入 Runnale/Blocked状态
 * 2.使用wait(Long m)方法,wait方法如果在毫秒值结束后 还没有被notify唤醒 ,就会自动醒来 线程进入 Runnale/Blocked状态
 * <p>
 * 唤醒的方法
 * 1.notify唤醒单个线程
 * 2.notifyAll唤醒所有线程
 */
public class WaitAndNotify2 {
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
                    synchronized (obj) {
                        System.out.println("我要包子1");
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
                        obj.notifyAll();//唤醒
                    }
                }
            }
        }.start();
    }
}
