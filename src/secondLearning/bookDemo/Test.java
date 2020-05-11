package secondLearning.bookDemo;

public class Test {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();
//        创建鼠标
        Mouse mouse = new Mouse();
        laptop.usbDevice(mouse);//向上转型
        USB keyboard = new Keyboard();
        laptop.usbDevice(keyboard);
        laptop.powerOff();
    }
}
