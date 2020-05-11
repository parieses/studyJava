package secondLearning;

//用final 修饰的类是太监类 不能被继承
public final class FinalClass {
    //成员变量 用final 必须手动赋值  要么构造赋值(二选其一)
    //必须保证类当中所有的重载的构造方法,都会最终对final 的成员变量进行赋值
    //当 final修饰方法的时候 方法不能被从写
    public final void reset() {
        final int num = 12;//被赋值就不能改变   唯一一次赋值
        final Object obj = new Object();//final 的引用类型变量 其中地址不可改变 内容可以改变
    }
}
