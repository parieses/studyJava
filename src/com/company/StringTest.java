package com.company;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.StringJoiner;

public class StringTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "Hello";
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s);
        String s1 = "hello";
        String s2 = "hello";
//        从表面上看，两个字符串用==和equals()比较都为true，但实际上那只是Java编译器在编译期，会自动把所有相同的字符串当作一个对象放入常量池，自然s1和s2的引用就是相同的。
//        所以，这种==比较返回true纯属巧合。换一种写法，==比较就会失败：
        System.out.println(s1 == s2);//true
        s2 = "HELLO".toLowerCase();
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true
        // 是否包含子串:
        System.out.println("Hello".contains("ll"));// true
        //搜索子串
        "Hello".indexOf("l"); // 2
        "Hello".lastIndexOf("l"); // 3
        "Hello".startsWith("He"); // true
        "Hello".endsWith("lo"); // true
        //提取子串
        "Hello".substring(2); // "llo"
        "Hello".substring(2, 4); //"ll"
        //去除首尾空白字符
        "  \tHello\r\n ".trim(); // "Hello"
//        另一个strip()方法也可以移除字符串首尾空白字符。它和trim()不同的是，类似中文的空格字符\u3000也会被移除：
        "\u3000Hello\u3000".strip(); // "Hello"
        " Hello ".stripLeading(); // "Hello "
        " Hello ".stripTrailing(); // " Hello"
        //String还提供了isEmpty()和isBlank()来判断字符串是否为空和空白字符串：
        "".isEmpty(); // true，因为字符串长度为0
        "  ".isEmpty(); // false，因为字符串长度不为0
        "  \n".isBlank(); // true，因为只包含空白字符
        " Hello ".isBlank(); // false，因为包含非空白字符
        //替换子串
        s = "Hello";
        s =  s.replace('e', 'w'); // "hewwo"，所有字符'l'被替换为'w'
        s.replace("ll", "~~"); // "he~~o"，所有子串"ll"被替换为"~~"
        System.out.println(s);
        s = "A,,B;C ,D";
        s.replaceAll("[\\,\\;\\s]+", ","); // "A,B,C,D"
        //分割字符串
        s = "A,B,C,D";
        String[] ss = s.split(","); // {"A", "B", "C", "D"}
        System.out.println(Arrays.toString(ss));
        //拼接字符串
        String[] arr = {"A", "B", "C"};
        s = String.join("***", arr); // "A***B***C"
        //类型转换
        String.valueOf(123); // "123"
        String.valueOf(45.67); // "45.67"
        String.valueOf(true); // "true"
        String.valueOf(new Object()); // 类似java.lang.Object@636be97c
        int n1 = Integer.parseInt("123"); // 123
        int n2 = Integer.parseInt("ff", 16); // 按十六进制转换，255
        boolean b1 = Boolean.parseBoolean("true"); // true
        boolean b2 = Boolean.parseBoolean("FALSE"); // false
        Integer.getInteger("java.version"); // 版本号，
        char[] cs = "Hello".toCharArray(); // String -> char[]
        s = new String(cs); // char[] -> String

        int[] scores = new int[] { 88, 77, 51, 66 };
        Score score = new Score(scores);
        score.printScores();
        scores[2] = 99;
        score.printScores();
        byte[] b3 = "Hello".getBytes(); // 按系统默认编码转换，不推荐
        byte[] b4 = "Hello".getBytes("UTF-8"); // 按UTF-8编码转换
        byte[] b5 = "Hello".getBytes("GBK"); // 按GBK编码转换
        byte[] b6 = "Hello".getBytes(StandardCharsets.UTF_8); // 按UTF-8编码转换
        char[] b7 = "hello".toCharArray();
        b7 = new char[]{'H', 'l'};
        System.out.println(b7);
        s = "";
        for (int i = 0; i < 1000; i++) {
            s = s + "," + i;
        }
        System.out.println(s);
        StringBuilder sb = new StringBuilder(1024);
        for (int i = 0; i < 1000; i++) {
            sb.append(',');
            sb.append(i);
        }
        s = sb.toString();
        System.out.println(s);
        sb = new StringBuilder(1024);
        sb.append("Mr ")
                .append("Bob")
                .append("!")
                .insert(0, "Hello, ");
        System.out.println(sb.toString());
        //自定义链式操作
        Adder adder = new Adder();
        adder.add(3)
                .add(5)
                .inc()
                .add(10);
        System.out.println(adder.value());
        //练习题
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields,1);
        System.out.println(insert);
        s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s);

        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
        String[] names = {"Bob", "Alice", "Grace"};
        sb = new StringBuilder();
        sb.append("Hello ");
        for (String name : names) {
            sb.append(name).append(", ");
        }
        // 注意去掉最后的", ":
        sb.delete(sb.length() - 2, sb.length());
        sb.append("!");
        System.out.println(sb.toString());
        var sj = new StringJoiner(", ");
        for (String name : names) {
            sj.add(name);
        }
        System.out.println(sj.toString());//Bob, Alice, Grace
    }
    static String buildInsertSql(String table, String[] fields,int type ) {
        if (type == 1) {
            // TODO:
            StringBuilder fie = new StringBuilder();
            for (String field : fields) {
                fie.append(field);
                fie.append(", ");
            }
            String result = fie.delete(fie.length() - 2 ,fie.length()).toString();
            return "INSERT INTO " + table + " (" + result + ") VALUES (?, ?, ?)";
        }else{
            return "INSERT INTO " + table + " (" + String.join(", ", fields) + ") VALUES (?, ?, ?)";
        }

    }
}
class Score {
    private int[] scores;
    public Score(int[] scores) {
        this.scores = scores.clone();//不会受外部改变影响
//        this.scores = scores;//会受外部改变影响
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}
class Adder {
    private int sum = 0;

    public Adder add(int n) {
        sum += n;
        return this;
    }

    public Adder inc() {
        sum ++;
        return this;
    }

    public int value() {
        return sum;
    }
}


