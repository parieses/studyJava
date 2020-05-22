package secondLearning.file;

import java.io.File;

/**
 * 创建  一个文件/文件夹
 * 删除
 * 获取
 * 判断                  是否存在
 * 对文件夹进行遍历
 * 获取文件大小
 */
public class FileDemo {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;//路径分隔符  windows : linux :
        char pathSeparatorChar = File.pathSeparatorChar;
        System.out.println(pathSeparator);
        System.out.println(pathSeparatorChar);
        String separator = File.separator;//文件名称分隔符 windows \ linux /
        System.out.println(separator);
        //可以文件夹结尾也可以文件结尾

    }
}
