package com.company.day12;

import java.io.*;

/**
 * 数据流 专门做基本数据的读写
 */
public class test {
    public static void main(String[] args) {
        try {
            testDataOutputStream();
            testDataInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 数据输出流
     */
    public static void testDataOutputStream() throws IOException {
        DataOutputStream ds = new DataOutputStream(new FileOutputStream("E:\\Self\\IdeaProjects\\src\\com\\company\\day12\\tt8.txt"));
        ds.writeBoolean(true);
        ds.flush();
        ds.close();
    }

    /**
     * 数据读写流
     *
     * @throws IOException
     */
    public static void testDataInputStream() throws IOException {
        DataInputStream in = new DataInputStream(new FileInputStream("E:\\Self\\IdeaProjects\\src\\com\\company\\day12\\tt8.txt"));
        boolean b1 = in.readBoolean();
        System.out.println(b1);
        in.close();

    }
}
