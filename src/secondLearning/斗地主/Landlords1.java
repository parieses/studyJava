package secondLearning.斗地主;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

//有序版本
public class Landlords1 {
    public static void main(String[] args) {
        List<String> type = List.of("♥", "♠", "♦", "♣");
        List<? extends Serializable> list = List.of("2", 'A', "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        HashMap<Integer, String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        int index = 0;
        poker.put(index, "大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        for (Serializable serializable : list) {
            for (String s : type) {
                index++;
                String str = serializable.toString() + s;
                poker.put(index, str);
                pokerIndex.add(index);
            }
        }
        //洗牌
        Collections.shuffle(pokerIndex);
        ArrayList<Integer> other = new ArrayList<>();
        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();
        ArrayList<Integer> three = new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            if (i < 51) {
                if (i % 3 == 0) {
                    one.add(pokerIndex.get(i));
                } else if (i % 3 == 1) {
                    two.add(pokerIndex.get(i));
                } else {
                    three.add(pokerIndex.get(i));
                }
            } else {
                other.add(pokerIndex.get(i));
            }
        }
        //排序
        Collections.sort(other);
        Collections.sort(one);
        Collections.sort(two);
        Collections.sort(three);
        //显示牌
        showPoker(poker, other);
        showPoker(poker, one);
        showPoker(poker, two);
        showPoker(poker, three);

    }

    public static void showPoker(HashMap<Integer, String> poker, ArrayList<Integer> pokerIndex) {
        for (Integer index : pokerIndex) {
            System.out.print(poker.get(index) + " ");
        }
        System.out.println();
    }
}
