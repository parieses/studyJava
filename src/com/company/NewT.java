package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NewT {
    public static void main(String[] args){
        int i = 0;
        int k = 1;
        System.out.println(i != 0  & ++k == 2);//第一个条件无论对错第二个都判断
        System.out.println(i == 0  && ++k == 3);//左边为真右边参与 左边为假 右边不参与
        //| || ||左边为真右边不参与判断 同上
        //15 为例
        //15 二进制 00000000 00000000 00000000 00001111
        //-15 二进制 11111111 1111111 11111111 11110001
        //计算过程 补码(负数的二进制) 等于反码 +1
        //反码 11111111 1111111 11111111 11110000
        //补码及+1 11111111 1111111 11111111 11110001
        System.out.println(3 << 2);//(m << n)m * 2的n次方 12
        //有无符号的右移 有符号看右移首位 1补1 0 补0   无符号都补0
        System.out.println(8 >> 2);//  2 (m << n)m / 2的n次方 7 正数右移补0 负数右移补1
        System.out.println(8 >>> 2);//2 正数同上负数补0
        System.out.println(-8 >>> 2);//1073741822
        //& 运算 看二进制 都为1 是一其余0   | 有1就为1   ^运算不同为1  相同为0  ~就是反码运算
        //12 & 5 = 4
        //00001100  12
        //00000101  5
        //00000100  4
        //12 |5 = 13
        //00001100  12
        //00000101  5
        //00001101  13
        //12 ^5 = 9
        //00001100  12
        //00000101  5
        //00001001  9
        //动态初始化
        int[] intA = new int[9];//声明一个能放9长度为9 的数组  默认值为0
        //静态初始化
        int[] intArr = {1,2,3,4};
        int[] intArra = new int[]{1,2,3,4};
        System.out.println(Arrays.toString(intA));
        //多维数组
        int[][] in = new int[5][2];
//        int[][] in = new int[5][];
        System.out.println(Arrays.deepToString(in));
        int[][] inAr = {{1,2,3,4},{1},{2},{3},{4}};
        System.out.println(Arrays.deepToString(inAr));
//        int[] x ,y[];//x 一维数组 二维数组y
        int[] inArs = Arrays.copyOf(intArr, intArr.length);
        System.out.println(Arrays.toString(inArs));
        //冒泡
        for( int n = 0; n < inArs.length - 1; n++ ) {
            for (int m = 0; m < inArs.length - 1 - n ;m++ ) {
                int tmp = 0;
                if (inArs[m] > inArs[m+1]){
                    tmp = inArs[m+1];
                    inArs[m+1] = inArs[m];
                    inArs[m] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(inArs));

    }
}
