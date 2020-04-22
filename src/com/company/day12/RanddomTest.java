package com.company.day12;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件的随机读写
 * 程序可以调到随机位置访问
 */
public class RanddomTest {
    public static void main(String[] args) {
        try {
//            testRead();
            testWrite();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void testRead() throws IOException {
        //RandomAccessFile 参数1 文件路径 参数2 方式指定的访问模式
        // r 只读方式 rw 打开读取和写入 rwd 打开完成读写 同步内容的更新
        //rwa 打开读取和写入 同步内容和元数据的更新
        //最常用的r rw
        RandomAccessFile rand = new RandomAccessFile("E:\\Self\\IdeaProjects\\src\\com\\company\\day12\\t10.txt", "r");
        rand.seek(0);//设置读取文件内容起始点
        byte[] b = new byte[1024];//设置一个数组
        int len = 0;
        while ((len = rand.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }
        rand.close();
    }

    public static void testWrite() throws IOException {
        RandomAccessFile rand = new RandomAccessFile("E:\\Self\\IdeaProjects\\src\\com\\company\\day12\\t10.txt", "rw");
//        rand.seek(0);//设置写的起始点 0 从头开始写
        //注意在文件的开头和中间写内容会被覆盖
        rand.seek(rand.length());//追加
        rand.writeUTF("达瓦大达瓦我我啊\n达瓦");
        rand.close();

    }
}
