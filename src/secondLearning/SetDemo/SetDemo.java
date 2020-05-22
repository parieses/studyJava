package secondLearning.SetDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * 不允许存储重复的元素
 * 没有索引,没有带索引的方法 不能用普通for循环
 */

/**
 * HasSet
 * 不允许存储重复的元素
 * 没有索引,没有带索引的方法 不能用普通for循环
 * 是一个无序的集合 ,存储和取出的顺序有可能不一样
 * 底层是一个哈希表结构(查询的速度非常快)
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(32);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Integer s : set) {
            System.out.println(s);
        }
        /*
         * 哈希值:是一个十进制的整数,有系统随机给出(就是对象地址值,是一个逻辑地址,是模拟出来的地址,不是数据实际存储的物理地址)
         */
        Object obj = new Object();//
        // public native int hashCode(); native代表该方法是调用本地操作系统的方法
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());//hashCode的16进制形式

        //String 从写了hashCode 方法
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354
        //哈希冲突:两个元素不同 哈希相同
        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
        /*
         * HashSet集合存储数据结构(哈希表)
         * jdk1.8 之前 哈希表 = 数组+链表
         * jdk1.8 之后 哈希表 = 数组+ 链表(如果链表长度超过8位那么就会吧链表转换成红黑树(提高查询的速度))
         *             哈希表 = 数组+红黑树(提高查询速度)
         * @TODO哈希表特点:速度快
         */
        HashSet<String> hash = new HashSet<>();
        //set在调用add方法是会调用元素的hashCode和equals 方法 判断元素是否重复
        hash.add("abc");
        //hashCode相同然后调用equals判断都相同不加入
        hash.add("abc");//不允许存储重复元素
        hash.add("重地");
        hash.add("通话");
        System.out.println(hash);
        System.out.println("abc".equals("abc"));//true

        HashSet<Person> person = new HashSet<>();
        Person p1 = new Person("大美女", 11);
        Person p2 = new Person("大美女", 11);
        Person p3 = new Person("大美女", 31);
        person.add(p1);
        person.add(p2);
        person.add(p3);
        //没有从写hashCode 和equals
        System.out.println(person);//@TODO [Person{name='大美女', age=11}, Person{name='大美女', age=11}]
        //从写hashCode 和equals @TODO [Person{name='大美女', age=11}]
        /*
            LinkedHashSet extends HashSet
            LinkedHashSet:底层是一个哈希表(数组+链表/红黑树)+链表:多了一条链表 用来记录元素的存储位置 保障元素位置有序
         */
        HashSet<String> str = new HashSet<>();
        str.add("www");
        str.add("abc");
        str.add("abc");
        str.add("it");
        System.out.println(str);//[abc, www, it]
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("www");
        linkedSet.add("abc");
        linkedSet.add("abc");
        linkedSet.add("it");
        linkedSet.add("abc");
        System.out.println(linkedSet);//[www, abc, it]  有序不允许重复
    }
}
