package com.company.day10;

/**
 * 学习java异常
 */
public class Error {
    public static void main(String[] args) throws Exception {//可以在main上继续抛出异常
        //main 方法抛出异常直接带虚拟机
        //TODO:数组越界异常
        String[] str = new String[5];
//        System.out.println(str[6]);//java.lang.ArrayIndexOutOfBoundsException
        //TODO:空指针异常
        A a = new A();
        a = null;
//        System.out.println(a.i);//java.lang.NullPointerException
        int i = 0;
        //由于异常导致程序中断 防止程序异常 捕获第一个后面不执行
        try {
//            System.out.println(3 / i);//java.lang.ArithmeticException

        } catch (Exception e) {//当不知道捕获的什么异常的时候使用异常父类
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("失败与否都会执行");
        }
        System.out.println("ok");
        try {
            Test t = new Test();
            t.test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//        if (){
//            throw new Exception("测试异常")
//        }

    }
}

class A {
    int i;
}

class Test {
    int i;

    public static void main(String[] args) {

    }

    public void test() throws Exception { //可以使用throws 抛出异常在调用方处理
        A a = null;
        System.out.println(a.i);
    }
}

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}