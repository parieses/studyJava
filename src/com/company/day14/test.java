package com.company.day14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Person person = new Person();
        Class c = person.getClass();//class对象中包含对象p所属的所有信息
//        System.out.println(c);
        Class c0 = Person.class;//通过类名.class 创建指定的class实例
        Class c1 = person.getClass();//通过有个类的实例对象. getClass() 获取对应实例的class实例
        try {
            //通过Class的静态方法foeName来获取一个类的Class实例
            //全路径 常用方式
            Class c2 = Class.forName("com.company.day14.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Class st = null;
        try {
            st = Class.forName("com.company.day14.Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        assert st != null;
        Class sup = st.getSuperclass();
        Class[] in = st.getInterfaces();
        System.out.println(sup.getName());
        for (Class i : in) {
            System.out.println("接口:" + i.getName());
        }
//        Method[] me = st.getMethods();//获取到类的所以得公有方法
        Method[] me = st.getDeclaredMethods();//获取所以方法
        for (Method m : me) {
            System.out.println("方法:" + m.getName());
            System.out.println("返回值类型:" + m.getReturnType());
            System.out.println("修饰符:" + m.getModifiers());
            Class[] pt = m.getParameterTypes();//获取方法的参数类型 是一个数组 方法有几个参数就有几个数组
            if (pt.length > 0) {
                for (Class p : pt) {
                    System.out.println("参数类型:" + p.getName());
                }
            }
        }
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        Field[] fd = st.getFields();//获取类的所有公有属性 包含父类
        Field[] fd = st.getDeclaredFields();//获取类的所有属性只有本类
        for (Field f : fd) {
            System.out.println("属性名称:" + f.getName());
            System.out.println("修饰符:" + f.getModifiers());
            System.out.println("属性的类型:" + f.getType());
        }
        System.out.println("###############################");
        System.out.println(st.getPackage());//获取类所在的包
        Constructor[] cs = st.getConstructors();//获取到类的公有的构造方法
        for (Constructor s : cs) {
            //返回数字代表
            System.out.println("构造器:" + s.getName() + "修饰符" + s.getModifiers());
            Class[] parm = s.getParameterTypes();
            for (Class pa : parm) {
                System.out.println("构造方法:" + s.getName() + "的参数类型" + pa.getName());
            }
        }
        System.out.println("********************************");
        Constructor[] dcs = st.getDeclaredConstructors();
        for (Constructor s : dcs) {
            //返回数字代表
            System.out.println("构造器:" + s.getName() + "修饰符" + s.getModifiers());
            Class[] parm = s.getParameterTypes();
            for (Class pa : parm) {
                System.out.println("构造方法:" + s.getName() + "的参数类型" + pa.getName());
            }
        }
        //通过用反射的构造方法来创建对象
        try {
            Class stt = Class.forName("com.company.day14.Student");
//            Object obj =  stt.newInstance();//无参构造
            Constructor co = stt.getDeclaredConstructor(String.class);
            Student st1 = (Student) co.newInstance("shool");
            //通过反射机制 可以强制调用私有方法
            Constructor co1 = stt.getDeclaredConstructor(String.class, int.class, String.class);//指定获取两个参数的构造方法
            co1.setAccessible(true);//解除私有封装,下面就可以强制调用
            Student st2 = (Student) co1.newInstance("shool", 12, "达瓦大");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //调用方法
        Class student1 = null;
        try {
            student1 = Class.forName("com.company.day14.Student");
            Constructor co2 = student1.getDeclaredConstructor();
            Object obj = co2.newInstance();//无参构造
            Method m = st.getMethod("setSchool", String.class);//得到方法
            m.invoke(obj, "高中");//参数1 是实例化的对象 后面是实际参数
            //调用私有方法
            m = st.getDeclaredMethod("test", String.class);//私有方法
            m.setAccessible(true);//解除私有封装 下面可以强制调用私有方法
            m.invoke(obj, "名字");//参数1 是实例化的对象 后面是实际参数
            //调用重载方法 和上述一样
            //有返回值的方法
            m = st.getMethod("getSchool");//得到方法
            String school = (String) m.invoke(obj);
            System.out.println(school);
            //调用指定属性
            Student student = (Student) obj;
            Field field = student1.getDeclaredField("school");
            field.set(student, "第三中学");
            System.out.println(field.get(student));
            Field field1 = student1.getDeclaredField("test");
            field1.setAccessible(true);
            field1.set(student, "测试私有属性");
            System.out.println(field1.get(student));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
