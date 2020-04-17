package com.company.day11;

import java.util.ArrayList;
import java.util.List;

interface IA {

}

public class Test1 {
    public static void main(String[] args) {
        Dd dd = new Dd();
        List<String> li = new ArrayList<String>();
        List<Integer> l2 = new ArrayList<Integer>();
        dd.test(li);
        dd.test(l2);
        List<C1> lc = new ArrayList<C1>();
        List<B11> b1 = new ArrayList<B11>();
        dd.test1(lc);
//        dd.test1(b1);//c1de父类放不进去
        dd.test2(b1);
        List<interfaceImpl> impl = new ArrayList<interfaceImpl>();
        dd.test3(impl);
    }
}

/*
泛型通配符
 */
class Dd {
    public void test(List<?> list) {//test方法需要list集合参数 不确定list的集合类型

    }

    public void test1(List<? extends C1> list) {//list参数是元素数据是c1 极其子类

    }

    public void test2(List<? super C1> list) { //只能存放c1极其父类

    }

    public void test3(List<? extends IA> list) {//list参数元素数据类型是IA的实现类

    }
}

class A1 {

}

class B11 extends A1 {

}

class C1 extends B11 {

}

class D1 extends C1 {

}

class interfaceImpl implements IA {

}