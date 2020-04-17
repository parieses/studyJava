package com.company.day09;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        // 定义长度为 5 的数组
        int[] scores = new int[]{57, 81, 68, 75, 91};
        // 输出原数组
        System.out.println("原数组内容如下：");
        // 循环遍历原数组
        for (int i = 0; i < scores.length; i++) {
            // 将数组元素输出
            System.out.print(scores[i] + "\t");
        }
        // 定义一个新的数组，将 scores 数组中的 5 个元素复制过来
        // 同时留 3 个内存空间供以后开发使用
        int[] newScores = (int[]) Arrays.copyOf(scores, 8);
        System.out.println("\n复制的新数组内容如下：");
        // 循环遍历复制后的新数组
        for (int j = 0; j < newScores.length; j++) {
            // 将新数组的元素输出
            System.out.print(newScores[j] + "\t");
        }
        // 定义长度为8的数组
        scores = new int[]{57, 81, 68, 75, 91, 66, 75, 84};
        System.out.println("原数组内容如下：");
        // 循环遍历原数组
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "\t");
        }
        // 复制原数组的前5个元素到newScores数组中
        newScores = (int[]) Arrays.copyOfRange(scores, 0, 5);
        System.out.println("\n复制的新数组内容如下：");
        // 循环遍历目标数组，即复制后的新数组
        for (int j = 0; j < newScores.length; j++) {
            System.out.print(newScores[j] + "\t");
        }
        // 定义原数组，长度为8
        scores = new int[]{100, 81, 68, 75, 91, 66, 75, 100};
        // 定义目标数组
        newScores = new int[]{80, 82, 71, 92, 68, 71, 87, 88, 81, 79, 90, 77};
        System.out.println("原数组中的内容如下：");
        // 遍历原数组
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "\t");
        }
        System.out.println("\n目标数组中的内容如下：");
        // 遍历目标数组
        for (int j = 0; j < newScores.length; j++) {
            System.out.print(newScores[j] + "\t");
        }
        System.arraycopy(scores, 0, newScores, 2, 8);
        // 复制原数组中的一部分到目标数组中
        System.out.println("\n替换元素后的目标数组内容如下：");
        // 循环遍历替换后的数组
        for (int k = 0; k < newScores.length; k++) {
            System.out.print(newScores[k] + "\t");
        }
        // 定义原数组，长度为8
        scores = new int[]{100, 81, 68, 75, 91, 66, 75, 100};
        System.out.println("原数组中的内容如下：");
        // 遍历原数组
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "\t");
        }
        // 复制数组，将Object类型强制转换为int[]类型
        newScores = (int[]) scores.clone();
        System.out.println("\n目标数组内容如下：");
        // 循环遍历目标数组
        for (int k = 0; k < newScores.length; k++) {
            System.out.print(newScores[k] + "\t");
        }
    }
}
