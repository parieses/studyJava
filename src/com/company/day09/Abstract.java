package com.company.day09;

public abstract class Abstract {
    public abstract void test();//只要类中有一个抽象方法那么这个类必须是抽象类

    public abstract void move();
}

class TestAbstract extends Abstract {

    @Override
    public void test() {

    }

    @Override
    public void move() {

    }
}
