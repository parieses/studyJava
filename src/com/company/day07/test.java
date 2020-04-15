package com.company.day07;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Person person = new Person("name", 12, 89);
        System.out.println(getFullName(person));
        Number n = new Double(123.456); // OK
//        String s = new Double(123.456); // compile error!
        System.out.println(n);
        //如何获取一个class的Class实例？有三个方法：
        //方法一：直接通过一个class的静态变量class获取
        java.lang.Class<String> cls1 = String.class;
        //方法二：如果我们有一个实例变量，可以通过该实例变量提供的getClass()方法获取：
        String s = "Hello";
        Class cls2 = s.getClass();
        //方法三：如果知道一个class的完整类名，可以通过静态方法Class.forName()获取：
        Class cls3 = Class.forName("java.lang.String");
        System.out.println(cls1);
        boolean sameClass = cls1 == cls2; // true

        Integer nn = new Integer(123);

        boolean b1 = nn instanceof Integer; // true，因为n是Integer类型
        boolean b2 = nn instanceof Number; // true，因为n是Number类型的子类

        boolean b3 = nn.getClass() == Integer.class; // true，因为n.getClass()返回Integer.class
//        boolean b4 = nn.getClass() == Number.class; // false，因为Integer.class!=Number.class
        printClassInfo("".getClass());
        printClassInfo(Runnable.class);
        printClassInfo(java.time.Month.class);
        printClassInfo(String[].class);
        printClassInfo(int.class);
//        Class stdClass = Student.class;
//        // 获取public字段"school":
//        System.out.println(stdClass.getField("school"));
//        // 获取继承的public字段"name":
//        System.out.println(stdClass.getField("name"));
//        // 获取private字段"sex":
//        System.out.println(stdClass.getDeclaredField("sex"));
        Field f = String.class.getDeclaredField("value");
        f.getName(); // "value"
        f.getType(); // class [B 表示byte[]类型
        int m = f.getModifiers();
        Modifier.isFinal(m); // true
        Modifier.isPublic(m); // false
        Modifier.isProtected(m); // false
        Modifier.isPrivate(m); // true
        Modifier.isStatic(m); // false
        //
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("hello"); // OK
        s = strList.get(0); // OK
        System.out.println(s);
        System.out.println(strList);


//        Person p = new Person();
        Student student = new Student();
        //以上是正常情况
        Person student1 = new Student();//父类的引用对象可以指向子类的实例

        //TODO:java方法运行在栈内存中,在运行方法是会动态的进栈出栈
        student1.printInfo();//此处调用为student的printInfo防方法
        Person p = new Person();
        p = new Student();
        p.printInfo();
        System.out.println(p instanceof Student);


    }

    public static String getFullName(Person person) {
        return person.getName();
    }

    static void printClassInfo(Class cls) {
        System.out.println("Class name: " + cls.getName());
        System.out.println("Simple name: " + cls.getSimpleName());
        if (cls.getPackage() != null) {
            System.out.println("Package name: " + cls.getPackage().getName());
        }
        System.out.println("is interface: " + cls.isInterface());
        System.out.println("is enum: " + cls.isEnum());
        System.out.println("is array: " + cls.isArray());
        System.out.println("is primitive: " + cls.isPrimitive());
    }

}
