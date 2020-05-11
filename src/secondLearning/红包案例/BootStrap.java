package secondLearning.红包案例;

import secondLearning.red.OpenMode;

/**
 * 1.普通红包
 * 2.手气红包 最少1 分钱 不超过平均数的2 倍
 */
public class BootStrap {
    public static void main(String[] args) {
        MyRed myRed = new MyRed("发红包案例");
        myRed.setOwnerName("群主");
        OpenMode normal = new RandomMod();//平均红包
        myRed.setOpenWay(normal);

    }
}
