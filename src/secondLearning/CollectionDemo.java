package secondLearning;

import secondLearning.SetDemo.Person;

import java.util.*;

/**
 * 共性方法
 * add() clear()  remove() contains() isEmpty() size() toArray()
 */
public class CollectionDemo {
    public static void main(String[] args) {
        collTest();
    }

    //共有方法
    public static void collTest() {
        Collection<Integer> contains = new ArrayList<>();
        System.out.println(contains);//从写了 toString方法
        contains.add(12);//返回值是Boolean
        System.out.println(contains);
        contains.remove(12);
        System.out.println(contains);
        System.out.println(contains.contains(12));//false 是否存在
        System.out.println(contains.isEmpty());
        System.out.println(contains.size());
        contains.add(12);
        contains.add(122);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //增强for循环
        for (Integer contain : contains) {
            System.out.println(contain);
        }
        System.out.println(Arrays.toString(contains.toArray()));
//        contains.clear();//清空集合 不删除集合
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //迭代器
        Iterator<Integer> iterator = contains.iterator();//获取迭代器
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        contains.forEach(System.out::println);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        Collections.addAll(list, "达瓦", "打底袜", "达瓦");
        System.out.println(list);
        Collections.shuffle(list);//打乱集合
        System.out.println(list);
        Collections.sort(list);//默认排序升序排序
        System.out.println(list);
        Person p1 = new Person("小花", 12);
        Person p2 = new Person("小留", 21);
        Person p3 = new Person("小李", 19);
        Person p4 = new Person("李李", 19);
        ArrayList<Person> pList = new ArrayList<>();
        pList.add(p1);
        pList.add(p2);
        pList.add(p3);
        pList.add(p4);
        System.out.println(pList);
        //被排序的集合里面存储的元素 必须实现comparable 从写compareTo规则
        Collections.sort(pList);
        System.out.println(pList);
        /*
            Comparator和Comparable 是有区别的
            Comparable 自己(this)和 别人参数比较,自己实现Comparable接口从写compareTo方法
            Comparator 找第三方裁判比较两个
         */
        Collections.sort(pList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(pList);
        pList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result = o2.getAge() - o1.getAge();
                if (result == 0) {
                    result = o2.getName().charAt(0) - o1.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(pList);
        ArrayList<Integer> iList = new ArrayList<>();
        iList.add(74);
        iList.add(5);
        iList.add(45);
        iList.add(547);
        iList.add(87);
        Collections.sort(iList, new Comparator<Integer>() {
            //从写比较规则
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;//升序
                return o2 - o1;//降序
            }
        });
        //等效上面
//        iList.sort(new Comparator<Integer>() {
//            //从写比较规则
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;//升序
//            }
//        });
        System.out.println(iList);


    }
}
