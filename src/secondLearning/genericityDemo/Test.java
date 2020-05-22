package secondLearning.genericityDemo;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        GenericClass<String> cls = new GenericClass<>();
        cls.setName("me");
        String name = cls.getName();
        System.out.println(name);
        testGeneric(12);
        cls.test("达瓦");
    }

    public static <T> void testGeneric(T t) {
        System.out.println(t);
    }

    //定义不能使用传递可以使用
    public static void testGenerics(ArrayList<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    /**
     * 泛型的上限限定 ? extend E 代表使用的泛型只能是E类型的子类或者本身
     * 泛型的下限限定 ? super E  代表使用的泛型只能是E类型的父类或者本身
     */
    public static void test1Generics(ArrayList<? extends Number> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void test2Generics(ArrayList<? super Number> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }
}
