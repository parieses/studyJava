package secondLearning;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        //jdk1.7开始右侧的尖括号内部可以不写内容
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList);//[]
        arrayList.add("抢完");
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        arrayList.remove(0);
        System.out.println(arrayList.size());
        arrayList.clear();
        arrayList.add("打的");
        arrayList.add("打的1");
        arrayList.add("打2的");
        arrayList.add("打3的");
        for (String name : arrayList) {
            System.out.println(name);
        }
        //集合存基本类型
        ArrayList<Integer> numArr = new ArrayList<>();
        ArrayList<Character> charArr = new ArrayList<>();
        ArrayList<Byte> b = new ArrayList<>();
    }
}
