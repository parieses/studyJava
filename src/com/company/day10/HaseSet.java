package com.company.day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HaseSet {
    public static void main(String[] args) {
        Set set = new HashSet();//Set<Object> set = new HashSet<Object>();
        set.add(1);
        set.add('q');
        set.add('c');
        set.add(null);
        System.out.println(set);
        set.remove(1);
        System.out.println(set);
        System.out.println(set.contains('q'));//判断是否存在q
//        set.clear();//清空
        //使用迭代器遍历集合
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //for each迭代集合
        for (Object o : set) {//
            System.out.println(o);
        }
        System.out.println(set.size());//获取大小
        //如果想要集合存同类型 泛型
        Set<String> set1 = new HashSet<String>();//指定类型集合
    }
}
