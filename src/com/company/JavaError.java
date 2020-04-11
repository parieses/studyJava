package com.company;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class JavaError {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 假设用户输入了abc：
        try {
            String s = "abc";
            int n = Integer.parseInt(s); // NumberFormatException!
        }catch (NumberFormatException ignored) {
            System.out.println("error");
        }
        String s =  "达瓦大";
        System.out.println( new String(s.getBytes(), StandardCharsets.UTF_8));
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }
    static byte[] toGBK(String s) {
        try {
            // 用指定编码转换String为byte[]:
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            // 如果系统不支持GBK编码，会捕获到UnsupportedEncodingException:
            System.out.println(e); // 打印异常信息
            return s.getBytes(); // 尝试使用用默认编码
        }
    }
}
