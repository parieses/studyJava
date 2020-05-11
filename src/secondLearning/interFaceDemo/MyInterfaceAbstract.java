package secondLearning.interFaceDemo;

//接口不能直接使用 只能通过实现类来实现
public interface MyInterfaceAbstract {
    public static final int COUNT = 0; //接口的常量 必须赋值

    //静态方法 9
    public static void method2() {
        System.out.println("接口静态方法");
    }

    private static void method4() {

    }

    //抽象方法 7
    public abstract void method();//两个修饰符可以省略

    //默认方法 8
    public default void method1() {
        System.out.println("接口默认方法");
    }

    //私有方法 普通私有 静态私有
    private void method3() {

    }
}
