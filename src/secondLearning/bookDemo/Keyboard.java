package secondLearning.bookDemo;

public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void press() {
        System.out.println("按键盘");
    }
}
