package secondLearning.lambda表达式;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        //使用匿名
        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };
        //使用lambda表达式  无参数 无返回值 代码块
        //->传递的意思 传递给方法体
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName() + "创建");
        };
        new Thread(runnable).start();
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "创建");
        }).start();
        //有参数无返回值
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.forEach(System.out::println);
        num.forEach(x -> {
            System.out.println(x);
            System.out.println(x);
        });
        Cook c = () -> {
            System.out.println("做饭");
        };
        c.makeFood();
        invokeCook(() -> {
            System.out.println("做饭1");
        });

        Person[] persons = {
                new Person("请问", 12),
                new Person("请1问", 122),
                new Person("请我问", 2)
        };
        //有参数有返回值
        Arrays.sort(persons, (o1, o2) -> o2.getAge() - o1.getAge());
        Arrays.sort(persons, Comparator.comparingInt(Person::getAge));
        System.out.println(Arrays.toString(persons));
        invokeCalc(1, 2, (a, b) -> a + b);
        invokeCalc(11, 22, Integer::sum);
        /*
            lambda表达式 可推导 可以省略
                1(参数列表):括号中的参数的数据类型,可以省略不写
                2(参数列表):括号中的参数如果只有一个name类型和()都可以省略
                3(一些代码):如果{}中的代码只有一行 无聊有没有返回值  都可以省略({},return ,分号)
         */
    }

    public static void invokeCook(Cook c) {
        c.makeFood();
    }

    public static void invokeCalc(int a, int b, Calculator c) {
        int sum = c.calc(a, b);
        System.out.println(sum);
    }
}
