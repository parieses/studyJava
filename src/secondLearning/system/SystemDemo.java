package secondLearning.system;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//当前时间毫秒
        test1_9999();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        System.arraycopy(arr1, 0, arr2, 0, 3);
        System.out.println(Arrays.toString(arr2));
    }

    //统计1-9999的运行时间
    public static void test1_9999() {
        long start = System.currentTimeMillis();
        for (int i = 9999; i > 0; i--) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start + "毫秒"); //
    }
}
