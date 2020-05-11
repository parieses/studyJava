package secondLearning.interFaceDemo;

public class Test {
    public static void main(String[] args) {
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.method();
        impl.method1();
        MyInterfaceAbstract.method2();
    }
}
