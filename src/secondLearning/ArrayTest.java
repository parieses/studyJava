package secondLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayTest {
    public static void main(String[] args) {
//        test1();
//        Phone[] listPhone = new Phone[]{
//                new Phone(),
//        };
//        System.out.println(Arrays.toString(listPhone));
//        ArrayList<Phone> phoneList = new ArrayList<>();
//        phoneList.add(new Phone());
//        System.out.println(phoneList);
        test2();
    }

    //生成6个1-33 的整数 添加到集合并遍历
    public static void test1() {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 6; i++) {
            int value = r.nextInt(32) + 1;
            list.add(value);
        }
        for (int l : list) {
            System.out.println(l);
        }
        printArray(list);
    }

    public static <E> void printArray(ArrayList<E> list) {
        StringBuilder s = new StringBuilder("{");
        for (int i = 0; i < list.size(); i++) {
            s.append(list.get(i));
            if (i != list.size() - 1) {
                s.append("@");
            }
        }
        s.append("}");
        System.out.println(s);
    }

    public static void test2() {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int value = r.nextInt(100) + 1;
            list.add(value);
            if (value % 2 == 0) {
                list1.add(value);
            }
        }
        System.out.println(list);
        System.out.println(list1);
    }
}
