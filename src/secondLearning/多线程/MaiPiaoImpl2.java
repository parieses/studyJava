package secondLearning.多线程;

/**
 * 实现卖票案例
 */
public class MaiPiaoImpl2 implements Runnable {
    static private int ticket = 100;

    //静态的同步方法 锁对象不能是this  静态方法优先于对象
    //静态方法的锁对象是本类的class属性-->class文件对象(反射)
    static synchronized void maiPiao() {
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

    @Override
    public void run() {
        while (true) {
            maiPiao();
        }
    }
}
