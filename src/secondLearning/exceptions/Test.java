package secondLearning.exceptions;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> user = new HashMap<>();
        while (true) {
            System.out.println("请输入用户名");
            String name = scanner.next();
            if (name.equals("q")) {
                break;
            }
            System.out.println("请输入密码");
            String pwd = scanner.next();
            try {
                boolean b = user.containsKey(name);
                if (b) {
                    throw new CustomExceptions("账号存在");
                } else {
                    user.put(name, pwd);
                }
            } catch (CustomExceptions e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
