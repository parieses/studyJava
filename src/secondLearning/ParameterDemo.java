package secondLearning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ParameterDemo {
    public static void main(String[] args) {
        parameter("12", 1, 2, 3, 4, 5);
        System.out.println(getSum(1, 2, 3, 4, 5));
    }

    /**
     * jdk1.5 之后出现的特性 参数类型确定个数不确定
     *
     * @param i 参数
     */
    public static void parameter(String s, int... i) {
        System.out.println(i);//[I@6e8cf4c6
        System.out.println(i[0]);
        System.out.println(Arrays.toString(i));
    }

    public static int getSum(int... num) {
        int sum = 0;
        for (int value : num) {
            sum += value;
        }
        return sum;
    }
}
