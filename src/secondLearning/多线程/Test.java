package secondLearning.多线程;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        new BaoZiPu(baoZi).start();
        new ChiHuo(baoZi).start();
    }
}

class BaoZi {
    String pi;
    String xian;
    boolean flag = false;

    @Override
    public String toString() {
        return "BaoZi{" +
                "pi='" + pi + '\'' +
                ", xian='" + xian + '\'' +
                ", flag=" + flag +
                '}';
    }
}

/**
 * 包子铺和包子线程关系--->通信(互斥)
 */
class BaoZiPu extends Thread {
    private BaoZi baoZi;

    public BaoZiPu(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (baoZi) {
                if (baoZi.flag == true) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count % 2 == 0) {
                    baoZi.pi = "薄皮";
                    baoZi.xian = "素馅";
                } else {
                    baoZi.pi = "厚皮";
                    baoZi.xian = "肉馅";
                }
                count++;
                System.out.println("正在生产" + baoZi);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                baoZi.flag = true;
                baoZi.notify();
                System.out.println("包子生产好了");
            }
        }

    }
}

class ChiHuo extends Thread {
    private BaoZi baoZi;

    public ChiHuo(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (baoZi) {
                if (baoZi.flag == false) {
                    try {
                        System.out.println("吃货睡眠中");
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("吃包子" + baoZi);
                baoZi.flag = false;
                baoZi.notify();
                System.out.println("包子吃完了");
            }
        }
    }
}