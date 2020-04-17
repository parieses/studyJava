package com.company.day11;

enum EnumTest implements ITest {
    SPRING("春天", "春暖花开"),//相当于调用构造方法 小枚举都调用构造方法
    SUMMER("夏天", "烈日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "白雪皑皑");
    private final String name;
    private final String desc;

    private EnumTest(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public void showInfo() {
        System.out.println(this.name + ": " + this.desc);
    }

    @Override
    public void test() {
        System.out.println("这是实现的ITest的接口的test方法");
    }
}

interface ITest {
    void test();
}

class TestEnum {
    public static void main(String[] args) {
        //这段代码执行的就是获取一个 枚举对象
        EnumTest spring = EnumTest.SPRING;
        spring.showInfo();//春天: 春暖花开
        //单例模式每次执行EnumTest.SPRING  都是一个对象 枚举类中的每个枚举都是单例模式
        System.out.println(EnumTest.SPRING);
        spring.test();
    }
}