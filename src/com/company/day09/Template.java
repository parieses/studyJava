package com.company.day09;

public abstract class Template {
    public final void getTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("执行时间是" + (end - start));
    }

    public abstract void code();
}

class SubTemplate extends Template {

    @Override
    public void code() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("i");
        }
    }
}

class TemplateTest {
    public static void main(String[] args) {
        SubTemplate sub = new SubTemplate();
        sub.getTime();
    }
}
