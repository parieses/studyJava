package secondLearning;

public class IntegerDemo {
    public static void main(String[] args) {
        //装箱
        Integer in1 = new Integer(12);
        Integer in2 = new Integer("12");
        Integer in3 = Integer.valueOf(12);
        Integer in4 = Integer.valueOf("12");
        //拆箱
        int in5 = in1.intValue();
        System.out.println(in5);
        //自动装箱和拆箱 JDK1.5 之后出现的特性
        Integer in6 = 12;
        int in7 = in6;
        System.out.println(in7);
        //基本类型和字符串相互装换
        String str1 = 1 + "";
        String str2 = in6.toString();
        String str3 = String.valueOf(in7);
        //字符串转其他类型
        Integer in8 = Integer.parseInt(str1);
        System.out.println(in8);
    }
}
