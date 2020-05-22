package secondLearning.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池就是一个容器
 * java.util.concurrent.Executors线程池的工厂类用来生产线程池
 * Executors.newFixedThreadPool(int 线程数量) 生产线程池的方法
 * submit执行start方法
 */
public class Demo {
    public static void main(String[] args) {
        //创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(i + ": " + Thread.currentThread().getName());
                }
            }
        };
        //会一直开启 使用完 会归还
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);
//        executorService.shutdown();//销毁线程池 不建议使用
    }
}
