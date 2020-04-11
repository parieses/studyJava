package com.company;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class IntTest {
    public static void main(String[] args) throws IntrospectionException {
        //==比较，较小的两个相同的Integer返回true，较大的两个相同的Integer返回false，这是因为Integer是不变类，编译器把Integer x = 127;自动变为Integer x = Integer.valueOf(127);，为了节省内存，Integer.valueOf()对于较小的数，始终返回相同的实例，因此，==比较“恰好”为true，但我们绝不能因为Java标准库的Integer内部有缓存优化就用==比较，必须用equals()方法比较两个Integer。
        Integer x = 127;
        Integer y = 127;
        Integer m = 99999;
        Integer n = 99999;
        System.out.println("x == y: " + (x==y)); // true
        System.out.println("m == n: " + (m==n)); // false
        System.out.println("x.equals(y): " + x.equals(y)); // true
        System.out.println("m.equals(n): " + m.equals(n)); // true
        //进制转换
        int x1 = Integer.parseInt("100"); // 100
        int x2 = Integer.parseInt("100", 16); // 256,因为按16进制解析
        System.out.println(Integer.toString(100)); // "100",表示为10进制
        System.out.println(Integer.toString(100, 36)); // "2s",表示为36进制
        System.out.println(Integer.toHexString(100)); // "64",表示为16进制
        System.out.println(Integer.toOctalString(100)); // "144",表示为8进制
        System.out.println(Integer.toBinaryString(100)); // "1100100",表示为2进制
        //自动装箱（Auto Boxing）
        int i = 100;
        n = Integer.valueOf(i);
        int a = n.intValue();
        System.out.println(n+a);
        //自动拆箱（Auto Unboxing
        // boolean只有两个值true/false，其包装类型只需要引用Boolean提供的静态字段:
        Boolean t = Boolean.TRUE;
        Boolean f = Boolean.FALSE;
        // int可表示的最大/最小值:
        int max = Integer.MAX_VALUE; // 2147483647
        int min = Integer.MIN_VALUE; // -2147483648
        // long类型占用的bit和byte数量:
        int sizeOfLong = Long.SIZE; // 64 (bits)
        int bytesOfLong = Long.BYTES; // 8 (bytes)
        // 向上转型为Number:
        Number num = new Integer(999); // = 999
// 获取byte, int, long, float, double:
        byte b = num.byteValue();
        int aa = num.intValue();
        long ln = num.longValue();
        float ff = num.floatValue();
        double d = num.doubleValue();
        //处理无符号整型
        //因为byte的-1的二进制表示是11111111，以无符号整型转换后的int就是255。
        //类似的，可以把一个short按unsigned转换为int，把一个int按unsigned转换为long。
        byte xx = -1;
        byte yy = 127;
        System.out.println(Byte.toUnsignedInt(xx)); // 255
        System.out.println(Byte.toUnsignedInt(yy)); // 127
        //要枚举一个JavaBean的所有属性，可以直接使用Java核心库提供的Introspector：
        BeanInfo info = Introspector.getBeanInfo(Persones.class);
        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
            System.out.println(pd.getName());
            System.out.println("  " + pd.getReadMethod());
            System.out.println("  " + pd.getWriteMethod());
        }
        //枚举类
        System.out.println(Weekday.FRI);
        Weekdays day = Weekdays.SUN;
        if (day == Weekdays.SAT || day == Weekdays.SUN) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }
        System.out.println(day.equals(Weekdays.SUN));//true
        String s = Weekdays.SUN.name(); // "SUN"
        n = Weekdays.MON.ordinal(); // 1
        Weekdayss days = Weekdayss.SUN;
        System.out.println(days.dayValue);
        if (days.dayValue == 6 || days.dayValue == 0) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }
        BigInteger bi = new BigInteger("1234567890");
        System.out.println(bi.pow(5)); // 2867971860299718107233761438093672048294900000
        BigInteger i1 = new BigInteger("1234567890");
        BigInteger i2 = new BigInteger("12345678901234567890");
        BigInteger sum = i1.add(i2); // 12345678902469135780
        //转换类型
        BigInteger ii = new BigInteger("123456789000");
        System.out.println(ii.longValue()); // 123456789000
//        System.out.println(ii.multiply(ii).longValueExact()); // java.lang.ArithmeticException: BigInteger out of long range
//        BigInteger和Integer、Long一样，也是不可变类，并且也继承自Number类。因为Number定义了转换为基本类型的几个方法：
//
//        转换为byte：byteValue()
//        转换为short：shortValue()
//        转换为int：intValue()
//        转换为long：longValue()
//        转换为float：floatValue()
//        转换为double：doubleValue()
        BigDecimal bd = new BigDecimal("123.4567");
        System.out.println(bd.multiply(bd)); // 15241.55677489
        BigDecimal d1 = new BigDecimal("123.45");
        BigDecimal d2 = new BigDecimal("123.4500");
        BigDecimal d3 = new BigDecimal("1234500");
        System.out.println(d1.scale()); // 2,两位小数
        System.out.println(d2.scale()); // 4
        System.out.println(d3.scale()); // 0
        BigDecimal d11 = new BigDecimal("123.4500");
        BigDecimal d22 = d11.stripTrailingZeros();
        System.out.println(d11.scale()); // 4
        System.out.println(d22.scale()); // 2,因为去掉了00

        BigDecimal d33 = new BigDecimal("1234500");
        BigDecimal d4 = d33.stripTrailingZeros();
        System.out.println(d3.scale()); // 0
        System.out.println(d4.scale()); // -2
        BigDecimal d111 = new BigDecimal("123.456789");
        BigDecimal d222 = d111.setScale(4, RoundingMode.HALF_UP); // 四舍五入，123.4568
        BigDecimal d333 = d111.setScale(4, RoundingMode.DOWN); // 直接截断，123.4567
        System.out.println(d222);
        System.out.println(d333);
        BigDecimal d12 = new BigDecimal("123.456");
        BigDecimal d21 = new BigDecimal("23.456789");
        BigDecimal d31 = d12.divide(d21, 10, RoundingMode.HALF_UP); // 保留10位小数并四舍五入
//        BigDecimal d41 = d12.divide(d21); // 报错：ArithmeticException，因为除不尽
//        求绝对值：
        Math.abs(-100); // 100
        Math.abs(-7.8); // 7.8
//        取最大或最小值：
        Math.max(100, 99); // 100
        Math.min(1.2, 2.3); // 1.2
        //计算x的y次方：
        Math.pow(2, 10); // 2的10次方=1024
        //计算√x：
        Math.sqrt(2);
        //计算e的x次方：
        Math.exp(2); // 7.389...
        //计算以e为底的对数
        Math.log(4); // 1.386...
        //计算以10为底的对数：
        Math.log10(100); // 2
        //三角函数：
        Math.sin(3.14); // 0.00159...
        Math.cos(3.14); // -0.9999...
        Math.tan(3.14); // -0.0015...
        Math.asin(1.0); // 1.57079...
        Math.acos(1.0); // 0.0
        double pi = Math.PI; // 3.14159...
        double e = Math.E; // 2.7182818...
        Math.sin(Math.PI / 6); // sin(π/6) = 0.5
        double x11 = Math.random(); // x的范围是[0,1)
        double min1 = 10;
        double max1 = 50;
        double y1 = x11 * (max1 - min1) + min1; // y的范围是[10,50)
        long n1 = (long) y1; // n的范围是[10,50)的整数
        System.out.println(y1);
        System.out.println(n1);
        long l = 1L;
        System.out.println(l);
        float fl = 1.1f;
        System.out.println(fl);
        String sss = null;
        System.out.println(sss);
        byte q = 1;
        int mm  = q ;
        byte w = (byte) mm;
        System.out.println(w );

    }
}
class Persons {
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Weekday {
    public static final int SUN = 0;
    public static final int MON = 1;
    public static final int TUE = 2;
    public static final int WED = 3;
    public static final int THU = 4;
    public static final int FRI = 5;
    public static final int SAT = 6;
}
class Color {
    public static final String RED = "r";
    public static final String GREEN = "g";
    public static final String BLUE = "b";
}
enum Weekdays {
    SUN, MON, TUE, WED, THU, FRI, SAT;
}
enum Weekdayss {
    MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(0);

    public final int dayValue;

    private Weekdayss(int dayValue) {
        this.dayValue = dayValue;
    }
}
enum Weekdayy {
    MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");

    public final int dayValue;
    private final String chinese;

    private Weekdayy(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return this.chinese;
    }
}
