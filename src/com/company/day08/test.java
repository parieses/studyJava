package com.company.day08;

public class test {
    public static void main(String[] args) {
        //小的数据类型自动转换
//        int a  = 12;
//        long b = a;
//        System.out.println(b);
        //大的数据类型手动转换
        long a = 12;
        int b = (int) a;
        //类的转换 子类到父类自动转换
//        Student s = new Student();
//        Person p = s;
//        Person p = new Person();
//        Student s = (Student) p;
        Object obj = "Hello";
        String str = (String) obj;
        System.out.println(obj.toString());
        //TODO:对于对象来说 要分成两种情况 特殊的类如(String,File ,Date) 使用== 比较对象地址 equals 比较的是内容 除了特除的类之外 ==和equals 比较的都是内存地址    如果想改变一个类的Equals, 不想用来比较内存地址就可以从写
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1 == p2);//false
        System.out.println(p1.equals(p2));//false
        String s1 = new String("123");
        String s2 = new String("123");
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true
        Order o1 = new Order(123, "qqq");
        Order o2 = new Order(123, "qqq");
        System.out.println(o1.equals(o2));
        MyDate myDate = new MyDate(2020, 4, 12);
        MyDate myDate1 = new MyDate(2020, 1, 12);
        System.out.println(myDate.equals(myDate1));
        //不从写 输出内存地址
        System.out.println(myDate.toString());
        System.out.println(myDate);//打对象 相当于打印头string
        Chinese.countryName = "中国";
        Chinese c = new Chinese();
        c.name = "111";
        c.age = 12;
        System.out.println(Chinese.countryName);
        Chinese.test();
        System.out.println(Utils.isEmpty(""));
        //想知道new 了 多少次Chinese
        Chinese cc = new Chinese();
        Chinese.show();
        //实现一个饿汉式的单例
        Single s = Single.getInstance();
        //懒汉模式
        Single1 ss = Single1.getInstance();
    }
}
