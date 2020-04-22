package com.company.day14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test2 {
    public static void main(String[] args) {
        ITest test = new TestDemoImpl();
        /*
         * 如果一个对象想要通过Proxy.newProxyInstance这种方式被代理
         * 那么这个类一定要有响应的接口
         * 就像本类中的 test 和TestDemoImpl
         */
        test.test1();
        test.test2();
        InvocationHandler handler = new ProxyDemo(test);
        /*
         * 参数1 代理对象的类加载器
         * 参数2 被代理对象的接口
         * 参数3 代理对象
         * 返回值 就是成功被代理后的对象
         */
        ITest test1 = (ITest) Proxy.newProxyInstance(handler.getClass().getClassLoader(), test.getClass().getInterfaces(), handler);
        test1.test1();
        test1.test2();
    }
}
