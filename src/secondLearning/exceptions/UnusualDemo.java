package secondLearning.exceptions;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;

/**
 * java.lang.Throwable 是所有异常的基类
 * Exception:编译期异常,进行编译java程序出现的问题
 * RuntimeException:运行期异常
 * Erroe:错误 必须修改源代码
 */
public class UnusualDemo {
    public static void main(String[] args) /*throws ParseException*/ {
        //编译期异常
        SimpleDateFormat secondLearning = new SimpleDateFormat("yyyy-MM-dd");
        try {
            secondLearning.parse("1999-09-09");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //运行异常
        try {
            int[] ints = {1, 2, 3};
            int element = getElement(ints, 1);
            System.out.println(ints[1]);
            throw new RuntimeException("测试异常");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
//            e.getMessage();
//            e.toString();
//            e.printStackTrace();
        }
        System.out.println("发顺丰");
        //内存溢出 必须修改代码
//        int[] array = new int[1024 * 1024 *1024];//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
//        Objects.requireNonNull(null);
        Objects.requireNonNull(null, "空");
    }

    //抛出 交给别人处理
    public static int getElement(int[] array, int index) throws RuntimeException {
        if (array == null) throw new RuntimeException("参数异常");
        if (index < 0 || index >= array.length) throw new RuntimeException("过小或者过大");
        return array[index];
    }

    public static void readFile(String filename) throws FileNotFoundException {
        if (!filename.equals("c://a.txt")) {
            throw new FileNotFoundException(filename);
        }
    }
}
