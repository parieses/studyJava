package com.company.day09;

/**
 * 如果一个类继承父类又实现接口
 * 那么先继承在实现
 */
public class TestInImpl2 extends Person implements TestIn, TestIn1 {

    @Override
    public void test() {

    }

    @Override
    public void test1() {

    }
}
