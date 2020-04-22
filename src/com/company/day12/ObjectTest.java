package com.company.day12;

import java.io.*;

/**
 * 序列化与反序列化
 * 对象的序列化与反序列化使用的类要严格一致 包名 类名 类机构
 */
public class ObjectTest {
    public static void main(String[] args) {
        try {
//            testSerialize();
            testDeserialize();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void testSerialize() throws IOException {
        //定义对象的输出流 把对象序列化的放到文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\Self\\IdeaProjects\\src\\com\\company\\day12\\t11.txt"));
        Person p = new Person();
        p.name = "张三";
        p.age = 12;
        oos.writeObject(p);
        oos.flush();
        oos.close();
    }

    public static void testDeserialize() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\Self\\IdeaProjects\\src\\com\\company\\day12\\t11.txt"));
        Person p = (Person) ois.readObject();
        System.out.println(p.name);
        ois.close();
    }
}
