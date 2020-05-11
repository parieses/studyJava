package secondLearning;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        //5.fori
//        for (int i = 0; i < 5; i++) {
//            for (int i1 = 0; i1 < 20; i1++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        System.out.println(getSum(100));
        printNum(10);
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};//省略格式
        int[] nums2 = nums;
//        nums2[1] =555;
        System.out.println(Arrays.toString(nums));//[1, 555, 3]
        System.out.println(getArray(nums2));
        System.out.println(Arrays.toString(get(nums)));
    }

    public static void printNum(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("hello Word");
        }
    }

    public static int getSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * 获取数组最大值
     *
     * @param array 原数组
     * @return 最大值
     */
    public static int getArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int[] get(int[] array) {
        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        return array;
    }
}
