package secondLearning.斗地主;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Landlords {
    String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    //红桃 黑桃 方片 梅花
    String[] type = {"♥", "♠", "♦", "♣"};

    public static int getLength(String[] list) {
        int len = 0;
        for (String item : list) {
            if (item != null) {
                len++;
            }
        }
        return len;
    }

    public ArrayList<String> getPai() {
        ArrayList<String> list = new ArrayList<>();
        for (String t : type) {
            for (String n : num) {
                list.add(t + n);
            }
        }
        list.add("大鬼");
        list.add("小鬼");
        //打乱顺序
        Collections.shuffle(list);
        return list;
    }

    public void useArray() {
        ArrayList<String> list = getPai();
        System.out.println(list);
        String[][] people = new String[3][17];
        String[] other = new String[3];
        for (int i = 0; i < list.size(); i++) {
            if (i < 51) {
                int len = getLength(people[i % 3]);
                System.out.println(len);
                people[i % 3][len] = list.get(i);
            } else {
                int len = getLength(other);
                other[len] = list.get(i);
            }
        }
        System.out.println(Arrays.deepToString(people));
        System.out.println(Arrays.toString(other));
    }

    public void useList() {
        ArrayList<String> list = getPai();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> other = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i < 51) {
                if (i % 3 == 0) {
                    player1.add(list.get(i));
                } else if (i % 3 == 1) {
                    player2.add(list.get(i));
                } else {
                    player3.add(list.get(i));
                }
            } else {
                other.add(list.get(i));
            }
        }
        System.out.println("玩家1" + player1);
        System.out.println("玩家2" + player2);
        System.out.println("玩家3" + player3);
        System.out.println("底牌" + other);
    }
}
