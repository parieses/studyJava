package secondLearning.bookDemo;

public class Laptop {
    public void powerOn() {
        System.out.println("开机");
    }

    public void powerOff() {
        System.out.println("关机");
    }

    //使用usb
    public void usbDevice(USB usb) {
        usb.open();
        if (usb instanceof Keyboard) {
            ((Keyboard) usb).press();
        }
        if (usb instanceof Mouse) {
            ((Mouse) usb).click();
        }
        usb.close();
    }
}
