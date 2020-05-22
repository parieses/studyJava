package secondLearning.多线程;

/**
 * 实现卖票案例
 */
public class MaiPiaoImpl1 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            maiPiao();
        }
    }

    //同时只能一个线程执行
    public synchronized void maiPiao() {
        Thread thread = Thread.currentThread();

        if (ticket > 0) {
            String name = thread.getName();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + "正在卖票" + ticket);
            ticket--;
        }
    }
}
