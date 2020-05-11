package secondLearning;

import java.util.Random;
import java.util.Scanner;

public class TestApi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        String s = sc.next();
        //匿名
//        int num1 =new Scanner(System.in).nextInt();
        //生成随机数
        Random random = new Random();
        System.out.println(random.nextInt(1000));
        //[1-n]
        System.out.println(random.nextInt(9) + 1);
    }
}
