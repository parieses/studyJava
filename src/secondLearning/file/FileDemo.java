package secondLearning.file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

/**
 * 创建  一个文件/文件夹
 * 删除
 * 获取
 * 判断                  是否存在
 * 对文件夹进行遍历
 * 获取文件大小
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        String pathSeparator = File.pathSeparator;//路径分隔符  windows : linux :
        char pathSeparatorChar = File.pathSeparatorChar;
        System.out.println(pathSeparator);
        System.out.println(pathSeparatorChar);
        String separator = File.separator;//文件名称分隔符 windows \ linux /
        System.out.println(separator);
        String path = "src/secondLearning/file";
//        show1(path);
//        show2(path);
        File file = new File(path, "/a.txt");
        //获取的方法
//        getMethod(file);
        //判断的方法
//        checkMethod(file);
        file = new File("./");
//        forTest(file);
//        int sum = getSum(100);
//        System.out.println(sum);
//        System.out.println(get(5));
//        forTest2(file);
        forTest3(file);

    }

    //file的获取相关的方法
    public static void getMethod(File file) {
        String absolutePath = file.getAbsolutePath();//返回绝对路劲
        System.out.println(absolutePath);//E:\Self\IdeaProjects\.\src\secondLearning\file\a.txt
        String path = file.getPath();//转换为路径名字符串
        System.out.println(path);//.\src\secondLearning\file\a.txt
        String name = file.getName();//获取文件或目录名称
        System.out.println(name);//a.txt
        long length = file.length();//获取文件大小  字节单位 不存在0   文件夹0
        System.out.println(length);//0
        System.out.println(file);//toString 调用的就是getPath方法
    }

    //file中判断功能的方法
    public static void checkMethod(File file) {
        boolean exists = file.exists();//判断是否存在
        System.out.println(exists);
        //电脑硬盘中只有文件/文件夹,两个方法互斥 必须存在 否则都是false
        boolean directory = file.isDirectory();//判断是目录
        boolean file1 = file.isFile();//判断是文件
        System.out.println(directory);
        System.out.println(file1);
    }

    //file创建删除功能的方法
    public static void createOrDelete(File file) throws IOException {
        /*
          文件不存在创建反悔true 文件存在 不创建反悔false
         */
        boolean newFile = file.createNewFile();//创建
        boolean mkdir = file.mkdir();//目录创建
        boolean mkdirs = file.mkdirs();//多级目录创建
        boolean delete = file.delete();//删除文件夹
    }

    /**
     * 第一个 构造方法
     *
     * @param path 路径
     * @throws IOException 异常
     */
    public static void show1(String path) throws IOException {
        //可以文件夹结尾也可以文件结尾
        File file = new File(path + "/a.txt");
        System.out.println(file.getPath());
        boolean newFile = file.createNewFile();//创建文件
        boolean canWrite = file.canWrite(); //是否可写
        long length = file.length();
        System.out.println(length + "长度");
        System.out.println(canWrite);
//        boolean delete = file.delete();//删除
    }

    /**
     * 第二种构造方法
     *
     * @param path 路劲
     */
    public static void show2(String path) {
        File file = new File(path, "/a.txt");
        System.out.println(file);
    }

    /**
     * 第三种构造方法
     *
     * @param path 路劲
     */
    public static void show3(String path) {
        File filePath = new File(path);
        File file = new File(filePath, "/a.txt");
        System.out.println(file);
    }

    public static void forTest(File file) {
        //获取当前目录下的文件和文件夹
        String[] list = file.list();//
        assert list != null;
        for (String s : list) {
            File f = new File(file, "/" + s);
            if (f.isDirectory()) {
                System.out.println("目录:" + f.getName());
                forTest(f);
            } else {
                System.out.println(f.getName());
            }
        }
    }

    public static void forTest1(File file) {
        File[] files = file.listFiles();
        assert files != null;
        for (File f : files) {
            if (f.isDirectory()) {
                System.out.println("目录:" + f.getName());
                forTest(f);
            } else {
                System.out.println(f.getName());
            }
        }
    }

    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + getSum(n - 1);
    }

    /*
     * 获取阶乘
     */
    public static int get(int n) {
        if (n == 1) {
            return 1;
        }
        return n * get(n - 1);
    }

    //查询后缀结尾的文件
    public static void forTest2(File file) {
        //获取当前目录下的文件和文件夹
        String[] list = file.list();//
        assert list != null;
        for (String s : list) {
            File f = new File(file, "/" + s);
            if (f.isDirectory()) {
                System.out.println("目录:" + f.getName());
                forTest2(f);
            } else {
                boolean b = f.getName().toLowerCase().endsWith(".java");
                if (b) {
                    System.out.println(f.getName());
                }
            }
        }
    }

    public static void forTest3(File file) {
//        File[] files = file.listFiles(pathname -> {
//            if (pathname.isFile()){
//                return pathname.getName().endsWith(".java");
//            }
//            return true;
//        });
        File[] files = file.listFiles((dir, name) -> {
            if (new File(dir, name).isFile()) {
                return name.endsWith(".java");
            }
            return true;
        });
        assert files != null;
        for (File f : files) {
            if (f.isDirectory()) {
                System.out.println("目录:" + f.getName());
                forTest3(f);
            } else {
                System.out.println(f.getName());
            }
        }
    }
}
