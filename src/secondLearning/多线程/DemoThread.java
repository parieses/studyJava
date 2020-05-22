package secondLearning.多线程;


public class DemoThread {
    public static void main(String[] args) {
//        MyThread t = new MyThread();
//        t.setName("线程名称");
//        t.start();
//        Thread thread = Thread.currentThread();
//        System.out.println(thread.getName());
//        MyThread t1 = new MyThread("构造名称");
//        t1.start();
        Thread t3 = new Thread() {
            @Override
            public void run() {
                super.run();
            }
        };
        /*
         * 好处
         * 避免了单继承的局限性  还可以继承其他的类
         * 增强了程序的扩展性 解耦
         */
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 59; i++) {
                    String name = Thread.currentThread().getName();
                    System.out.println(i + " " + name);

                }
            }
        }, "Runnable");
        t2.start();
        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 59; i++) {
                System.out.println(i);
            }
        });
        t4.start();
    }
}
