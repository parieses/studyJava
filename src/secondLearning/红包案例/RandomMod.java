package secondLearning.红包案例;

import secondLearning.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMod implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int count = totalCount; count > 1; count--) {
            int money = 1 + random.nextInt(totalMoney / count * 2);
            totalMoney -= money;
            list.add(money);
        }
        list.add(totalMoney);
        return list;
    }
}
