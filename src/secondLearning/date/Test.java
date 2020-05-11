package secondLearning.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        long current = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入出生日照:格式yyyy-MM-dd");
        String birthday = scanner.next();
        SimpleDateFormat simp = new SimpleDateFormat("yyyy-MM-dd");
        Date bir = simp.parse(birthday);
        long time = current - bir.getTime();
        System.out.println(time);
        System.out.println(time / 1000 / 60 / 60 / 24);

    }
}
