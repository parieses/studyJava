//package com.company;
//
//import java.util.Date;
//public class PrimitiveTypeTest {
//    static boolean bool;
//    static byte by;
//    static char ch;
//    static double d;
//    static float f;
//    static int i;
//    static long l;
//    static short sh;
//    static String str;
//    public static void main(String[] args) {
//        // byte
//        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
//        System.out.println("包装类：java.lang.Byte");
//        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
//        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
//        System.out.println();
//
//        // short
//        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
//        System.out.println("包装类：java.lang.Short");
//        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
//        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
//        System.out.println();
//
//        // int
//        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
//        System.out.println("包装类：java.lang.Integer");
//        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
//        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
//        System.out.println();
//
//        // long
//        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
//        System.out.println("包装类：java.lang.Long");
//        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
//        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
//        System.out.println();
//
//        // float
//        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
//        System.out.println("包装类：java.lang.Float");
//        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
//        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
//        System.out.println();
//
//        // double
//        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
//        System.out.println("包装类：java.lang.Double");
//        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
//        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
//        System.out.println();
//
//        // char
//        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
//        System.out.println("包装类：java.lang.Character");
//        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
//        System.out.println("最小值：Character.MIN_VALUE="
//                + (int) Character.MIN_VALUE);
//        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
//        System.out.println("最大值：Character.MAX_VALUE="
//                + (int) Character.MAX_VALUE);
//        //test
//        System.out.println("Bool :" + bool);
//        System.out.println("Byte :" + by);
//        System.out.println("Character:" + ch);
//        System.out.println("Double :" + d);
//        System.out.println("Float :" + f);
//        System.out.println("Integer :" + i);
//        System.out.println("Long :" + l);
//        System.out.println("Short :" + sh);
//        System.out.println("String :" + str);
//        int a = 60; /* 60 = 0011 1100 */
//        int b = 13; /* 13 = 0000 1101 */
//        int c = 0;
//        c = a & b;       /* 12 = 0000 1100 */
//        System.out.println("a & b = " + c );
//
//        c = a | b;       /* 61 = 0011 1101 */
//        System.out.println("a | b = " + c );
//
//        c = a ^ b;       /* 49 = 0011 0001 */
//        System.out.println("a ^ b = " + c );
//
//        c = ~a;          /*-61 = 1100 0011 */
//        System.out.println("~a = " + c );
//
//        c = a << 2;     /* 240 = 1111 0000 */
//        System.out.println("a << 2 = " + c );
//
//        c = a >> 2;     /* 15 = 1111 */
//        System.out.println("a >> 2  = " + c );
//
//        c = a >>> 2;     /* 15 = 0000 1111 */
//        System.out.println("a >>> 2 = " + c );
//        c = a + b;
//        System.out.println("c = a + b = " + c );
//        c += a ;
//        System.out.println("c += a  = " + c );
//        c -= a ;
//        System.out.println("c -= a = " + c );
//        c *= a ;
//        System.out.println("c *= a = " + c );
//        a = 10;
//        c = 15;
//        c /= a ;
//        System.out.println("c /= a = " + c );
//        a = 10;
//        c = 15;
//        c %= a ;
//        System.out.println("c %= a  = " + c );
//        c <<= 2 ;
//        System.out.println("c <<= 2 = " + c );
//        c >>= 2 ;
//        System.out.println("c >>= 2 = " + c );
//        c >>= 2 ;
//        System.out.println("c >>= 2 = " + c );
//        c &= a ;
//        System.out.println("c &= a  = " + c );
//        c ^= a ;
//        System.out.println("c ^= a   = " + c );
//        c |= a ;
//        System.out.println("c |= a   = " + c );
//        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));
//        System.out.println("0度的余弦值：" + Math.cos(0));
//        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));
//        System.out.println("1的反正切值： " + Math.atan(1));
//        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
//        System.out.println(Math.PI);
//        double[] nums = { 1.4, 1.5, 1.6, -1.4, -1.5, -1.6 };
//        for (double num : nums) {
//            test(num);
//        }
//        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
//        String helloString = new String(helloArray);
//        System.out.println( helloString );
//        String site = "www.runoob.com";
//        int len = site.length();
//        System.out.println( "菜鸟教程网址长度 : " + len );
////        String fs;
////        fs = String.format("浮点型变量的值为 " + "%f, 整型变量的值为 " + " %d, 字符串变量的值为 " + " %s", floatVar, intVar, stringVar);
//        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
//        sBuffer.append("www");
//        sBuffer.append(".runoob");
//        sBuffer.append(".com");
//        System.out.println(sBuffer);
//        // 数组大小
//        int size = 10;
//        // 定义数组
//        double[] myList = new double[size];
//        myList[0] = 5.6;
//        myList[1] = 4.5;
//        myList[2] = 3.3;
//        myList[3] = 13.2;
//        myList[4] = 4.0;
//        myList[5] = 34.33;
//        myList[6] = 34.0;
//        myList[7] = 45.45;
//        myList[8] = 99.993;
//        myList[9] = 11123;
//        // 计算所有元素的总和
//        double total = 0;
//        for (int i = 0; i < size; i++) {
//            total += myList[i];
//        }
//        System.out.println("总和为： " + total);
////        double[] myList = {1.9, 2.9, 3.4, 3.5};
//
//        // 打印所有数组元素
//        for (int i = 0; i < myList.length; i++) {
//            System.out.println(myList[i] + " ");
//        }
//        // 计算所有元素的总和
//        double total = 0;
//        for (int i = 0; i < myList.length; i++) {
//            total += myList[i];
//        }
//        System.out.println("Total is " + total);
//        // 查找最大元素
//        double max = myList[0];
//        for (int i = 1; i < myList.length; i++) {
//            if (myList[i] > max) max = myList[i];
//        }
//        System.out.println("Max is " + max);
//        double[] myList = {1.9, 2.9, 3.4, 3.5};
//
//        // 打印所有数组元素
//        for (double element: myList) {
//            System.out.println(element);
//        }
//        printArray(new int[]{1.9, 2.9, 3.4, 3});
//        // 初始化 Date 对象
//        Date date = new Date();
//
//        // 使用 toString() 函数显示日期时间
//        System.out.println(date.toString());
//        Date dNow = new Date( );
//        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
//
//        System.out.println("当前时间为: " + ft.format(dNow));
//        // 初始化 Date 对象
//        Date date = new Date();
//
//        //c的使用
//        System.out.printf("全部日期和时间信息：%tc%n",date);
//        //f的使用
//        System.out.printf("年-月-日格式：%tF%n",date);
//        //d的使用
//        System.out.printf("月/日/年格式：%tD%n",date);
//        //r的使用
//        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);
//        //t的使用
//        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date);
//        //R的使用
//        System.out.printf("HH:MM格式（24时制）：%tR",date);
//        Date date=new Date();
//        //b的使用，月份简称
//        String str=String.format(Locale.US,"英文月份简称：%tb",date);
//        System.out.println(str);
//        System.out.printf("本地月份简称：%tb%n",date);
//        //B的使用，月份全称
//        str=String.format(Locale.US,"英文月份全称：%tB",date);
//        System.out.println(str);
//        System.out.printf("本地月份全称：%tB%n",date);
//        //a的使用，星期简称
//        str=String.format(Locale.US,"英文星期的简称：%ta",date);
//        System.out.println(str);
//        //A的使用，星期全称
//        System.out.printf("本地星期的简称：%tA%n",date);
//        //C的使用，年前两位
//        System.out.printf("年的前两位数字（不足两位前面补0）：%tC%n",date);
//        //y的使用，年后两位
//        System.out.printf("年的后两位数字（不足两位前面补0）：%ty%n",date);
//        //j的使用，一年的天数
//        System.out.printf("一年中的天数（即年的第几天）：%tj%n",date);
//        //m的使用，月份
//        System.out.printf("两位数字的月份（不足两位前面补0）：%tm%n",date);
//        //d的使用，日（二位，不够补零）
//        System.out.printf("两位数字的日（不足两位前面补0）：%td%n",date);
//        //e的使用，日（一位不补零）
//        System.out.printf("月份的日（前面不补0）：%te",date);
//    }
//    private static void test(double num) {
//        System.out.println("Math.floor(" + num + ")=" + Math.floor(num));
//        System.out.println("Math.round(" + num + ")=" + Math.round(num));
//        System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));
//    }
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//    }
//
//}