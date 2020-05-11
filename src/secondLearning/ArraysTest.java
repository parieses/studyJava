package secondLearning;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] intArr = {5, 1, 2, 3, 4};
        System.out.println(Arrays.toString(intArr));
        //排序
        /*
         * 备注
         * 1.如果数字,默认从小到大
         * 2.如果字符串 按之母升序
         * 3.如果自定义类型 那么就需要定义Comparable或者Comparator的接口支持
         */
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        ArrayTest();
    }

    public static void ArrayTest() {
        String str = "dwavjkawdampjcakcmawdwkadlaf";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        // arr.forr
//        for (int i = arr.length - 1; i >= 0; i--) {
//
//        }
    }
}
