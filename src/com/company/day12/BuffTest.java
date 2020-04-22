package com.company.day12;

import java.io.*;

public class BuffTest {
    private static String inPath = "E:\\Self\\IdeaProjects\\src\\com\\company\\day12\\tt7.txt";
    private static String outPath = "E:\\Self\\IdeaProjects\\src\\com\\company\\day12\\tt1.txt";

    public static void main(String[] args) {
        try {
            testBufferedInputStream();
//            testBufferedOutputStream();
//            testBufferedReader();
//            testBufferedWriter();
//            copyBufferedStream();
            copyBuffered();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void testBufferedInputStream() throws Exception {
        //文件字节输入流对象
        FileInputStream in = new FileInputStream(BuffTest.inPath);
        //把文件字节流放到缓冲字节输入流
        BufferedInputStream bin = new BufferedInputStream(in);
        byte[] b = new byte[1024];//设置一个数组
        int len = 0;
        while ((len = bin.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }
        //倒着关
        bin.close();
        in.close();
    }

    public static void testBufferedOutputStream() throws IOException {
        FileOutputStream out = new FileOutputStream(BuffTest.outPath);
        BufferedOutputStream bos = new BufferedOutputStream(out);
        String str = "达瓦达瓦";
        bos.write(str.getBytes());
        bos.flush();
        bos.close();
        out.close();
    }

    public static void copyBufferedStream() throws IOException {
        FileInputStream in = new FileInputStream(BuffTest.inPath);
        //把文件字节流放到缓冲字节输入流
        BufferedInputStream bin = new BufferedInputStream(in);
        FileOutputStream out = new FileOutputStream("E:\\Self\\IdeaProjects\\src\\com\\company\\day12\\tt2.txt");
        BufferedOutputStream bos = new BufferedOutputStream(out);
        byte[] b = new byte[10];//设置一个数组
        int len = 0;
        while ((len = bin.read(b)) != -1) {
            bos.write(b, 0, len);//写入内存中
        }
        bos.flush();
        bos.close();
        out.close();
        bin.close();
        in.close();
    }

    //缓冲字符流
    public static void testBufferedReader() throws IOException {
        FileReader fr = new FileReader(BuffTest.inPath);
        BufferedReader bfr = new BufferedReader(fr);
        char[] buffer = new char[100];
        int len = 0;
        while ((len = bfr.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len));
        }
        bfr.close();
        fr.close();

    }

    public static void testBufferedWriter() throws IOException {
        FileWriter fw = new FileWriter(BuffTest.outPath);
        BufferedWriter bfr = new BufferedWriter(fw);
        String str = "wadwadwadawd w下文安德瓦达瓦";
        bfr.write(str);
        bfr.close();
        fw.close();
    }

    public static void copyBuffered() throws IOException {
        FileReader fr = new FileReader(BuffTest.inPath);
        BufferedReader bfr = new BufferedReader(fr);
        FileWriter fw = new FileWriter("E:\\Self\\IdeaProjects\\src\\com\\company\\day12\\tt2.txt");
        BufferedWriter bfw = new BufferedWriter(fw);
        char[] buffer = new char[100];
        int len = 0;
        while ((len = bfr.read(buffer)) != -1) {
            bfw.write(buffer, 0, len);
        }
        bfw.close();
        fw.close();
        bfr.close();
        fr.close();
    }
}
