package com.company;

import java.util.Arrays;
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        System.out.println("测试");
        int x = 100; // 定义int类型变量x，并赋予初始值100
        System.out.println(x); // 打印该变量的值，观察是否为100
        x = 200; // 重新赋值为200
        System.out.println(x); // 打印该变量的值，观察是否为200
        intTest();
        floatTest();
        booleanTest();
        charTest();
        var i = 0;
        System.out.println(i);
        calculation();
        arithmeticOverflow();
        int a = 72;
        int b = 105;
        int c = 65281;
        String  s = "" + (char) a + (char) b + (char) c;
        System.out.println(s);//Hi!
        double d = 3.1415926;
//        占位符	说明
//        %d	格式化输出整数
//        %x	格式化输出十六进制整数
//        %f	格式化输出浮点数
//        %e	格式化输出科学计数法表示的浮点数
//        %s	格式化字符串
        System.out.printf("%.2f\n", d); // 显示两位小数3.14
        System.out.printf("%.4f\n", d); // 显示4位小数3.1416
        int n = 12345000;
        System.out.printf("n=%d, hex=%08x", n, n); // 注意，两个%占位符必须传入两个数
//        in();
//        getBmi();
        System.out.println();
        int[] ns = {1, 1, 2, 3, 5, 8};
        System.out.println(Arrays.toString(ns));
        int[] nss = {1, 4, 9, 16, 25};
        // 倒序打印数组元素:
        for (int j = nss.length - 1; j >= 0; j--) {
            System.out.println(nss[j]);
        }
        ns = new int[]{28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
        ns = new int[]{28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        for (int k = 0; k < ns.length - 1; k++) {//第一层获取循环次数 数组长度减一
            for (int l = 0; l < ns.length - k - 1; l++) {
                if (ns[l] < ns[l + 1]) {
                    int tmp = ns[l];
                    ns[l] = ns[l + 1];
                    ns[l + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(ns));
        int[][] as = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(Arrays.deepToString(as));
        int[][] scores = {
                {82, 90, 91},
                {68, 72, 64},
                {95, 91, 89},
                {67, 52, 60},
                {79, 81, 85},
        };
        double average = 0;
        int count = 0;
        for (int[] sums : scores) {
            for (int sum : sums) {
                count++;
                average += sum;
            }
        }
        System.out.println(average / count);
        City bj = new City();
        bj.name = "Beijing";
        bj.latitude = 39.903;
        bj.longitude = 116.401;
        System.out.println(bj.name);
        System.out.println("location: " + bj.latitude + ", " + bj.longitude);
        Student student = new Student("小明");
        student.run();
    }

    public static void intTest() {
        // 定义整型
        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // 加下划线更容易识别
        int i4 = 0xff0000; // 十六进制表示的16711680
        int i5 = 0b1000000000; // 二进制表示的512
        long l = 9000000000000000000L; // long型的结尾需要加L
    }

    public static void floatTest() {
        //浮点型
        float f1 = 3.14f;
        float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
        double d = 1.79e308;
        double d2 = -1.79e308;
        double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
    }

    public static void booleanTest() {
        //布尔类型
        boolean b1 = true;
        boolean b2 = false;
        boolean isGreater = 5 > 3; // 计算结果为true
        int age = 12;
        boolean isAdult = age >= 18; // 计算结果为false
    }

    public static void charTest() {
        final double PI = 3.14; // PI是一个常量
        double r = 5.0;
        double area = PI * r * r;
//        PI = 300; // compile error!
    }

    public static void calculation() {
        int i = (100 + 200) * (99 - 88); // 3300
        int n = 7 * (5 + (i - 9)); // 23072
        System.out.println(i);
        System.out.println(n);
    }

    //TODO:运算溢出
    public static void arithmeticOverflow() {
        //类型设置为long可解决
        int x = 2147483640;
        int y = 15;
        int sum = x + y;
        System.out.println(sum); // -2147483641
    }

    //TODO:移位运算
    public static void shiftOperation() {
//        int n = 7;       // 00000000 00000000 00000000 00000111 = 7
//        int a = n << 1;  // 00000000 00000000 00000000 00001110 = 14
//        int b = n << 2;  // 00000000 00000000 00000000 00011100 = 28
//        int c = n << 28; // 01110000 00000000 00000000 00000000 = 1879048192
//        int d = n << 29; // 11100000 00000000 00000000 00000000 = -536870912
//        int n = 7;       // 00000000 00000000 00000000 00000111 = 7
//        int a = n >> 1;  // 00000000 00000000 00000000 00000011 = 3
//        int b = n >> 2;  // 00000000 00000000 00000000 00000001 = 1
//        int c = n >> 3;  // 00000000 00000000 00000000 00000000 = 0
//        int n = -536870912;
//        int a = n >> 1;  // 11110000 00000000 00000000 00000000 = -268435456
//        int b = n >> 2;  // 11111000 00000000 00000000 00000000 = -134217728
//        int c = n >> 28; // 11111111 11111111 11111111 11111110 = -2
//        int d = n >> 29; // 11111111 11111111 11111111 11111111 = -1
//        int n = -536870912;
//        int a = n >>> 1;  // 01110000 00000000 00000000 00000000 = 1879048192
//        int b = n >>> 2;  // 00111000 00000000 00000000 00000000 = 939524096
//        int c = n >>> 29; // 00000000 00000000 00000000 00000111 = 7
//        int d = n >>> 31; // 00000000 00000000 00000000 00000001 = 1
    }

    //TODO:位运算
    public static void bitOperation() {
//        n = 0 & 0; // 0
//        n = 0 & 1; // 0
//        n = 1 & 0; // 0
//        n = 1 & 1; // 1
//        n = 0 | 0; // 0
//        n = 0 | 1; // 1
//        n = 1 | 0; // 1
//        n = 1 | 1; // 1
//        n = ~0; // 1
//        n = ~1; // 0
//        n = 0 ^ 0; // 0
//        n = 0 ^ 1; // 1
//        n = 1 ^ 0; // 1
//        n = 1 ^ 1; // 0
    }

    //TODO:在Java的计算表达式中，运算优先级从高到低依次是：
    //()
    //! ~ ++ --
    //* / %
    //+ -
    //<< >> >>>
    //&
    //|
    //+= -= *= /=
    //强制转型
    public static void forcedTransformation() {
//        int n1 = (int) 12.3; // 12
//        int n2 = (int) 12.7; // 12
//        int n2 = (int) -12.7; // -12
//        int n3 = (int) (12.7 + 0.5); // 13
//        int n4 = (int) 1.2e20; // 2147483647
    }

    public static void in() {
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.print("Input your name: "); // 打印提示
        String  name = scanner.nextLine(); // 读取一行输入并获取字符串
        System.out.print("Input your age: "); // 打印提示
        int age = scanner.nextInt(); // 读取一行输入并获取整数
        System.out.printf("Hi, %s, you are %d\n", name, age); // 格式化输出
    }

    public static void getBmi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身高");
        double height = scanner.nextDouble();
        System.out.println("请输入体重");
        double width = scanner.nextDouble();
        double bmi = width / Math.pow(height, 2);
        System.out.println(bmi);
        if (bmi < 18.5) {
            System.out.println("过轻");
        } else if (bmi < 25) {
            System.out.println("正常");
        } else if (bmi < 28) {
            System.out.println("过重");
        } else if (bmi < 32) {
            System.out.println("肥胖");
        } else {
            System.out.println("过于肥胖");
        }
    }

}
class City {
    String name;
    double latitude;
    double longitude;

}
//class Person {
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setName(String one,String two) {
//        this.name = one + two;
//    }
//}
interface Person {
    String getName();
    default void run() {
        System.out.println(getName() + " run");
    }
}
class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
