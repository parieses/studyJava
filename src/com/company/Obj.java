package com.company;

import com.company.test.TestPack;

public class Obj {
    public static void main(String[] args) {
        Persones per = new Persones();
        System.out.println(Persones.sex);
        //匿名对象
        new Persones().showName();
        double r = 2;
        double area = new Circle().area(r);
        System.out.println("面积为:" + area);

        //对象存堆 栈中存cir   cir指向 Circle对象  引用对象
        Circle cir = new Circle();
        cir.mOl(1);
        cir.mOl(1, 2);
        cir.mOl("重载方法oml");
        String[] str = new String[]{"1212", "大卫杜夫访问"};
        cir.test("1212", "大卫杜夫访问");
        cir.test(str);
        cir.test1(str);
        cir.test(1, "1212", "大卫杜夫访问");
        cir.test(1, str);
        //TODO:栈(stack)基础数据的类型 对象的引用(对象的地址)
        //TODO:堆(heap)所以的对象(包括自己定义的对象和字符串对象)
        //TODO:方法区(method) 所有的class和static的变量
        //TODO:基础数据类型,值在栈中,引用对象,值保存在堆中,栈中存的是对象在堆中的地址
        //引用传值
        //TODO:传递的是对象在堆中的地址,所以ds ds1 栈中存储都最终指向堆中地址
        DataSwap ds = new DataSwap();
        System.out.println("在调用swap前的ds.a的值" + ds.a);//1
        swap(ds);
        System.out.println("在调用swap的ds.a的值" + ds.a);//6
        TestPack tp = new TestPack();
//        com.company.test.TestPack tpp = new com.company.test.TestPack();
    }

    public static void swap(DataSwap ds1) {
        ds1.a = 6;
        System.out.println("在Swap中ds1.a的值为" + ds1.a);//6
    }

}

class DataSwap {
    public int a = 1;
}


