package secondLearning.多线程;

/**
 * 实现卖票案例
 */
public class MaiPiaoImpl implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        while (true) {
            /*
             * 同步原理技术原理 使用一个锁对象叫同步锁也叫锁对象也叫对象监视器
             */
            synchronized (this) {//同步代码块  只让一个线程在同步代码块中执行
                if (ticket > 0) {
                    String name = thread.getName();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(name + "正在卖票" + ticket);
                    ticket--;
                }
            }
        }
    }
}
