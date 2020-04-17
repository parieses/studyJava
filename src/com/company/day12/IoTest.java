package com.company.day12;

import java.io.*;
import java.util.Arrays;

public class IoTest {
    public static void main(String[] args) throws IOException {
        //file类只能操作文件本身不能操作内容
        File file = new File("./tt.txt");
//        File file = new File("./tt.txt");
//        File file = new File("."+File.separator+"tt.txt");
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsoluteFile());//绝对路径
        System.out.println(file.createNewFile());//创建新的文件
        System.out.println(Arrays.toString(File.listRoots()));
//        file.renameTo(new File("./tt1.txt"));

        System.out.println(file.lastModified());//最后的修改时间
        System.out.println(file.length());//返回文件长度单位是字节
//        mkdir mkdirs 创建目录和多级目录
        //list 返回当前文件夹下的内容  listFiles 返回文件数组
        File file1 = new File("./");
        list(file1);
        //文件字节输入流
        FileInputStream in = new FileInputStream(file);
        byte[] b = new byte[10];//设置一个数组
//        in.read(b);
        int len = 0;
        System.out.println(Arrays.toString(b));
        while ((len = in.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
//            new String(b,0,len)参数1 缓冲数据的数组,参数2从哪个文字开始转换参数3 一共转化多少字节
        }
        in.close();//使用完关闭
        //文件字节输出流
        FileOutputStream out = new FileOutputStream(file);
        String str = "dafaefee";
        out.write(str.getBytes());//把数据写到内存  参数1缓冲数组参数2是从什么位置开始 参数3 写的总长度
        out.flush();//把内存的数据刷写到硬盘
        out.close();
        copyFile(file, new File("./ttt.txt"));
        //字符输入流 z只能操作内容时候字符的文件
        FileReader fr = new FileReader("./ttt.txt");
        char[] c = new char[1024];
        int len1 = 0;
        while ((len = fr.read(c)) != -1) {
            System.out.println(new String(c, 0, len));
        }
        fr.close();
        System.out.println(fr);
        //字符输出流
        FileWriter fw = new FileWriter("./ttt1.txt");
        String s = new String("123");
        fw.write(s);
        fw.flush();
        fw.close();

    }

    /**
     * 递归遍历
     *
     * @param file 文件对象
     */
    public static void list(File file) {
        if (file.isFile()) {
            System.out.println(file.getAbsolutePath() + "是文件");
        } else {
            System.out.println(file.getAbsolutePath() + "是文件夹");
            //还存在子目录
            File[] file1 = file.listFiles();//获取当前文件下的文件或文件夹
            if (file1 != null && file1.length > 0) {
                for (File fi : file1) {
                    list(fi);
                }
            }
        }
    }

    /**
     * @param file1 源文件
     * @param file2 输出文件
     * @throws IOException 异常
     */
    public static void copyFile(File file1, File file2) throws IOException {
        FileInputStream in = new FileInputStream(file1);
        FileOutputStream out = new FileOutputStream(file2);
        byte[] b = new byte[100];//设置一个数组
        int len = 0;
        while ((len = in.read(b)) != -1) {
            out.write(b, 0, len);
        }
        out.flush();
        in.close();
        out.close();
    }
}
