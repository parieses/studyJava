package com.company.day11;

import java.lang.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Target(ElementType.FIELD)//注解的是属性 给其他类的属性做注解
@Retention(RetentionPolicy.RUNTIME)//定义注解的声明周期
@Documented
@interface TestAn {
    public int id() default 0;

    public String desc() default "";
}

//注解这部分作为了解 开源项目会使用到
public class TestAnnotation {
    public static void main(String[] args) {
        TestB tb = new TestB();
        tb.test1();//过时的注解
        @SuppressWarnings("rawtypes")//抑制警告
                List list = new ArrayList();
    }
}

class TestA {
    void test() {
    }

    ;
}

class TestB extends TestA {
    @TestAn(id = 100, desc = "姓名")
    String name;

    @Override
    void test() {
        super.test();
    }

    @Deprecated
    public void test1() {
    }
}