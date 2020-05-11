package secondLearning;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        getStringNum();
        String str1 = new String("abc");
        String str2 = new String(new char[]{'a', 'b', 'c'});
        String str3 = new String(new byte[]{97, 98, 99});
        String str4 = "abc";//只要直接写的在常量池 引用== 地址值得比较
        System.out.println(Objects.equals(str4, str3));
        System.out.println("abc".equals(str4));
        String str5 = "ABC";
        //不区分大小写
        System.out.println(str5.equalsIgnoreCase(str1));//忽略大小写
        //在堆中常量池
        //双引号直接写的在常量池当中 new的不在池当中
        //String 获取相关操作
        System.out.println(str4.length());//长度
        System.out.println(str4.concat("拼接"));//拼接  生成新的字符串
        System.out.println(str4.charAt(2));//获取指定位子的字符串
        System.out.println(str4.indexOf('a'));//查找首次出现的位置 没有返回-1
        //字符串截取 [) 左闭右开
        System.out.println(str4.substring(0, 2));//截取
        char[] chars = str4.toCharArray();//转换成字符数组
        byte[] bytes = str4.getBytes();
        System.out.println(str4.replace("a", "达瓦大"));
        String str6 = "aaa,bbb,ccc,ddd,";
        String[] array1 = str6.split(",");
        System.out.println(Arrays.toString(array1));
        //split 方法的参数是正则表达式 如果用. 分割 必须 \\.
        String str7 = "aaa.bbb.ccc.ddd.";
        System.out.println(Arrays.toString(str6.split("\\.")));
    }

    public static void getStringNum() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] ch = str.toCharArray();
        int countUpper = 0, countLower = 0, countNumber = 0, countOther = 0;
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if ('A' <= c && c <= 'Z') {
                countUpper++;
            } else if ('a' <= c && c <= 'z') {
                countLower++;
            } else if ('0' <= c && c <= '9') {
                countNumber++;
            } else {
                countOther++;
            }
        }
        System.out.println("大写:" + countUpper);
        System.out.println("小写:" + countLower);
        System.out.println("数字:" + countNumber);
        System.out.println("其他:" + countOther);


    }
}
