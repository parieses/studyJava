package secondLearning;

import java.util.TreeSet;

public class MathTest {
    public static void main(String[] args) {
        //绝对值 abs
        System.out.println(Math.abs(-1));//1
        //想上取值ceil
        System.out.println(Math.ceil(2.1));//3.0
        //向下取整 抹零
        System.out.println(Math.floor(2.1));//2.0
        //四舍五入round
        System.out.println(Math.round(2.5));//3
        System.out.println(Math.PI * Math.pow(2, 2));
        test();
    }

    //计算-10.0-5.9 之间绝对值 大于 或者小于2.1的整数有几个
    public static void test() {
        TreeSet<Integer> set = new TreeSet<>();
        for (double i = -10.8; i < 5.9; i += 0.1) {
            int abs = (int) Math.abs(i);
            if (6 < abs || abs <= 2.1) {
                set.add((int) i);
            }
        }
        System.out.println(set);
        System.out.println(set.size());
    }
}
