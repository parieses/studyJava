package secondLearning.InnerClass;

public class Test {
    public static void main(String[] args) {
        Body body = new Body();
        //通过外部类调用内部类  间接方式
        body.methodBody();
        //直接方式
        Body.Heart heart = new Body().new Heart();
        heart.beat();
        heart.getNum();
        body.testClass();
        //如果接口的实现类(或者是父类的子类) 只需要使用唯一的一次 那么这个情况就可以省略该类的定义 使用匿名内部类
        MyInterface obj = new MyInterfaceImpl();
        obj.method();
        //匿名内部类
        obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名实现");
            }
        };
        obj.method();

    }
}
