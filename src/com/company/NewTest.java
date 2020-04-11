package com.company;

public class NewTest {
    public static void main(String[] args){
        int q = 0, w =1, e = 1;
        System.out.println(q);
        //隐式转换
        byte b = 1;
        short s = 2;
        int i = 3;
        //多种数据类型进行运算系统会把数据类型转换成最大的类型进行运算 数字类型 容量的从小到大 byte short int long float double
        int j =  b + s + i;
        long g =  b + s + i;
        System.out.println((short) b);
        System.out.println(j);
        char c = 'a';//在进行加减运算会转成相对应的ASCII码进行运算 单引号为char 双引号为String
        //string 加任何类型都是string
        String str = "abc";
        System.out.println(str+b+g);//abc16
        //多个数据类型进行运算  会先转成相对应的数据类型进行运算   两个byte类型的计算得到int
        System.out.println(3 + 4 + "1212");//71212
        byte b2 = 1 ,b3 = 1;
        int i1 = b2 + b3 ;
        //强制类型转换 只能转换基本数据类型
        byte b1 = (byte) w;
        //字符串不能喝基本类型转换需要基本对应的包装类进行转换
        String ss = "74";
        int ii = Integer.parseInt(ss);
        System.out.println(ii);
        //boolean  不能进行转换
        System.out.println(7/2);//整数除于整数  会自动舍弃小数
        System.out.println(11%5);
        //++ 在前取新值 ++ 在后取旧值
        System.out.println('*'+'\t' + '*');
        System.out.println("*"+ '\t' + '*');
        short sh = 3;
//        sh = sh +1 ; short 进行运算会变成int 不知道运算会不会超出变量范围 会先吧变量变成int进行计算
        sh +=3;
        System.out.println(sh);
    }
}
