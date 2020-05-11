package secondLearning.sendRedBag;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int money, int count) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int leftMoney = super.getMoney();
        if (money > leftMoney) {
            System.out.println("余额不足");
            return list;
        }
        super.setMoney(leftMoney - money);
        int avg = money / count;
        int mod = money % count;
        //除不开的放到最后的红包
        for (int i = 0; i < count - 1; i++) {
            list.add(avg);
        }
        list.add(avg + mod);
        return list;
    }
}
