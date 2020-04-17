package com.company.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

interface IB<T> {
    T test(T t);
}

public class Test {
    public static void main(String[] args) {
        List<java.io.Serializable> list = new ArrayList<>();
        list.add("test");
        list.add("1212");
        list.add("31");
        list.add(true);
        System.out.println(list);
        //需求只能在集合中使用字符串
        //java的泛型 只在编译阶段有效,在编译过程中,正确检验泛型结果后会将泛型的相关信息擦除,
        //并且在对象进入和离开方法的边界添加类型的检查和类型的转换的方法,也就是说泛型信息不回进入到运行阶段
        List<String> list2 = new ArrayList<String>();
        list2.add("test");
        list2.add("1212");
        list2.add("31");
        A<String> a = new A<String>();//new 的时候指定泛型的类型为String
        a.setKey("达瓦达瓦");
        String key = a.getKey();
        A<Integer> a1 = new A<Integer>();//new
        a1.setKey(12);
        Integer key1 = a1.getKey();
        //不指定泛型 相当于Object的类型
        //泛型接口使用区别
        B1<Objects> b1 = new B1<Objects>();
        //已经确定类型
        B2 b2 = new B2();

        //泛型方法再点调用之前没有固定的数据类型
        //在调用时传入什么类型 就改成什么类型
        //泛型方法会在调用时确定具体的数据类型

    }

}

/**
 * 泛型类
 *
 * @param <T>此处的泛型T 任意的取名 一般大写T 以为type
 */
class A<T> {
    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}

/**
 * 为传入泛型实参是,与泛型类的定义相同 需要将泛型的声明也一起加入到类中
 *
 * @param <T>
 */
class B1<T> implements IB<T> {

    @Override
    public T test(T t) {
        return null;
    }
}

/**
 * 如果实现接口时 如果实现了具体类型  都会替换成具体类型
 */
class B2 implements IB<Integer> {

    @Override
    public Integer test(Integer integer) {
        return null;
    }
}
//静态方法的泛型不能使用类变量

/**
 * 泛型方法
 */
class BM {
    public void test(Integer integer) {

    }

    // 无返回值的泛型方法
    public <T> void test(T t) {

    }

    public String test1(String s) {
        return null;
    }

    //有返回值的泛型方法
    public <T> T test2(T t) {
        return t;
    }

    //可变参数的泛型方法
    public <T> void test3(T... t) {
        for (T s : t) {
            System.out.println(s);
        }
    }
}


