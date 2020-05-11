package secondLearning.sendRedBag;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);
        Member one = new Member("1", 0);
        Member two = new Member("2", 0);
        Member three = new Member("3", 0);
        ArrayList<Integer> list = manager.send(100, 3);
        one.receive(list);
        two.receive(list);
        three.receive(list);
        System.out.println(manager.toString());
        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
    }
}
