package secondLearning;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        //范围1-100
        int num = new Random().nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            if (count <= 10) {
                System.out.println("输入要猜测的数据");
                int in = sc.nextInt();
                if (in > num) {
                    System.out.println("太大");
                } else if (in < num) {
                    System.out.println("太小");
                } else {
                    System.out.println("猜对了");
                    break;
                }
                count++;
            } else {
                System.out.println("最多尝试10次");
                break;
            }
        }
    }
}
