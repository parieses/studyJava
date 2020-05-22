package secondLearning.ListDemo;

import java.util.*;

/**
 * 继承 Collecion
 * 特点:
 * 1.有序的集合,存储和取出的元素的顺序是一致的
 * 2.有索引
 * 3.允许重复
 */

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("A");
        list.add("B");
        System.out.println(list);//从写toString
        list.add(2, "插入");
        System.out.println(list);
        String B = list.remove(3);//被移除的元素
        System.out.println(B);
        System.out.println(list);//[A, A, 插入]
        list.set(0, "a");//替换
        System.out.println(list);//[a, A, 插入]
        //遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //增强for
        for (String s : list) {
            System.out.println(s);
        }
        /**
         * 1底层是一个链表结构,查询慢增删快
         * 2里面包含了大量首尾的方法
         */
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("哒");
        linkedList.addLast("最后");//等效于add
        linkedList.addFirst("开始");
        linkedList.push("打的");//等同于addFirst
        System.out.println(linkedList);
        linkedList.pop();//等同于removeFirst
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        linkedList.clear();//清空
        System.out.println(linkedList.isEmpty());
        //单线程 慢 了解
        Vector<String> vector = new Vector<>();
        vector.add("等我");
        vector.addElement("打的");
        System.out.println(vector);
        Enumeration<String> elements = vector.elements();
        while (elements.hasMoreElements()) {
            System.out.println(elements.nextElement());
        }

    }
}
