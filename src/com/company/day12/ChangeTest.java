package com.company.day12;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class ChangeTest {
    private static String inPath = "E:\\Self\\IdeaProjects\\src\\com\\company\\day12\\tt7.txt";

    /**
     * 字节转换成字符效率更高
     *
     * @param args
     */
    public static void main(String[] args) {
        //所有文件都有编码格式,txt对于java有三种编码
        //ISO8859-1 西欧编码 是纯英文编码 不适用汉字
        //GBK和UTF-8 适用于中文和英文  一般utf-8
        try {
//            testInputStreamReader();
            testOutputStreamWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 转换输入流
     * 在转换字符流的时候 字符编码要一致 不然会出现乱码
     */
    public static void testInputStreamReader() throws IOException {
        FileInputStream in = new FileInputStream(inPath);
        //把字节流转为字符流
        InputStreamReader reader = new InputStreamReader(in, StandardCharsets.UTF_8);//字节流 编码
        char[] buffer = new char[1024];
        int len = 0;
        while ((len = reader.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len));
        }
        reader.close();
        in.close();

    }

    public static void testOutputStreamWriter() throws IOException {
        FileOutputStream out = new FileOutputStream(inPath);
        OutputStreamWriter writer = new OutputStreamWriter(out, "GBK");
        String str = "驱蚊器我气得";
        writer.write(str);
        writer.flush();
        writer.close();
        out.close();
    }
}
