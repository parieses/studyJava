package com.company.day07;

import java.util.logging.Logger;

public class JDKLogging {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        logger.info("start process...");
        logger.warning("memory is running out...");
        logger.fine("ignored.");
        logger.severe("process will be terminated...");
        //对比可见，使用日志最大的好处是，它自动打印了时间、调用类、调用方法等很多有用的信息。
        //
        //再仔细观察发现，4条日志，只打印了3条，logger.fine()没有打印。这是因为，日志的输出可以设定级别。JDK的Logging定义了7个日志级别，从严重到普通：
        //
        //SEVERE
        //WARNING
        //INFO
        //CONFIG
        //FINE
        //FINER
        //FINEST
    }
}
