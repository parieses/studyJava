package com.company.day09;

public class Test4 {
}

/**
 * 可以使用内部类实现类的多重继承
 */
class A {
    public static void main(String[] args) {
        A a = new A();
        a.testB();
    }

    public void testB() {
        new InnerB().testB();
    }

    public void testC() {
        new InnerC().testC();
    }

    private static class InnerB extends B {
        @Override
        public void testB() {
            System.out.println("这是从写之后的testB");
        }
    }

    private static class InnerC extends C {
        @Override
        public void testC() {
            System.out.println("这是从写之后的testC");
        }
    }
}

class B {
    public void testB() {

    }
}

class C {
    public void testC() {

    }
}
