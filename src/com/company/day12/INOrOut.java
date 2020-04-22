package com.company.day12;

import java.io.*;

public class INOrOut {

    public static void main(String[] args) {
        try {
//            testIn();
            testInOut();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 标准的输入流
     *
     * @throws IOException
     */
    public static void testIn() throws IOException {
        //创建接收键盘输入数据的输入流
        InputStreamReader in = new InputStreamReader(System.in);
        //把输入流放入缓存流
        BufferedReader br = new BufferedReader(in);
        String str = "";//定义临时接收数据的字符串
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
        in.close();
    }

    /**
     * 输出
     *
     * @throws IOException
     */
    public static void testInOut() throws IOException {
        //创建接收键盘输入数据的输入流
        InputStreamReader in = new InputStreamReader(System.in);
        //把输入流放入缓存流
        BufferedReader br = new BufferedReader(in);
        FileWriter fw = new FileWriter("E:\\Self\\IdeaProjects\\src\\com\\company\\day12\\tt7.txt");
        BufferedWriter bfw = new BufferedWriter(fw);
        String str = "";//定义临时接收数据的字符串
        while ((str = br.readLine()) != null) {
            if (str.equals("over")) {
                break;
            }
            bfw.write(str + "\n");//
        }
        bfw.flush();
        bfw.close();
        fw.close();
        br.close();
        in.close();
    }
}
