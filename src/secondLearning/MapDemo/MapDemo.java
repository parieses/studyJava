package secondLearning.MapDemo;

import java.util.*;

/**
 * map集合的特点:双列集合一个key一个value
 * map集合中的元素key和value的数据类型可以相同也可以不同
 * map集合可以不允许重复
 * map key和value以一对映
 */

/*
 * jdk9的新特性 set接口 map接口 list 接口 里面增加一个静态方法of
 * 适用前提:个数确定不再改变
 */
public class MapDemo {
    public static void main(String[] args) {
//        HashMapTest();
//        show1();
//        show2();
//        LinkedHashMapTest();
//        hashTableTest();
        demo();
        //不支持操作  重复会抛出异常 长度不能在修改
        List<Integer> integers = List.of(1, 23, 3, 4254, 5, 225, 215, 12, 15, 235, 2);
        Map<Integer, Integer> integerIntegerMap = Map.of(1, 3, 2, 4);
        Set<Integer> integers1 = Set.of(1, 231, 414, 12, 34);
    }

    /**
     * 底层哈希表 查询特别快
     * jdk1.8之前 数组+单向链表
     * jdk1.8之后 数组+单向链表/红黑树(长度超过8)
     * 无无序的
     */
    public static void HashMapTest() {
        HashMap<String, String> map = new HashMap<>();
        String v1 = map.put("a", "b");//没有一样的返回null  如果key存在  value 会替换
        map.put("a", "c");
        System.out.println(v1);
        map.put("c", "d");
        map.remove("d");//key不存在返回null 存在返回被删除的value
        System.out.println(map.containsKey("a"));//判断是否有key
        System.out.println(map.containsValue("d"));//判断是否有value
        System.out.println(map);
        System.out.println(map.get("a"));//key存在返回对应的值 不存咋返回null
        //map的第一种遍历方式 key找值
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println("key:" + key + "=" + map.get(key));
        }
        //迭代器循环
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Set<Map.Entry<String, String>> mSet = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator1 = mSet.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        //键值对对象,键与值得映射关系
        for (Map.Entry<String, String> entry : mSet) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    /**
     * 底层哈希表+链表(保证迭代的顺序) 查询特别快
     * 有序的集合
     */
    public static void LinkedHashMapTest() {
        //key 不允许重复
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "f");
        map.put("g", "h");
        System.out.println(map);
    }

    /**
     * 底层也是哈希表 线程安全集合(单线程) 速度慢
     * 不能存null值 null键
     * HashTable 和Vector 集合一样  jdk1.2 之后去取代了
     */
    public static void hashTableTest() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put(null, null);
        System.out.println(map);
        Hashtable<String, String> table = new Hashtable<String, String>();
//        table.put(null,null);//java.lang.NullPointerException
        System.out.println(table);
    }

    public static void show1() {
        //自定义类型
        HashMap<String, Person> persons = new HashMap<>();
        persons.put("上海", new Person("张三", 18));
        persons.put("北京", new Person("张三", 19));
        persons.put("郑州", new Person("张三", 18));
        persons.put("郑州", new Person("王五", 18));

        System.out.println(persons);
    }

    public static void show2() {
        HashMap<Person, String> persons = new HashMap<>();
        persons.put(new Person("张三", 12), "张三");
        persons.put(new Person("张三", 121), "张三");
        persons.put(new Person("李四", 121), "李四");
//        Set<Person> keySet = persons.keySet();
//        for (Person key : keySet ){
//            System.out.println("key:"+key+"="+persons.get(key));
//        }
        Set<Map.Entry<Person, String>> mSet = persons.entrySet();
        for (Map.Entry<Person, String> entry : mSet) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    public static void demo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要统计的字符串:");
        String next = scanner.next();
        System.out.println(next);
        char[] c = next.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char i : c) {
            boolean b = map.containsKey(i);
            int count = 1;
            if (b) {
                count = map.get(i) + count;
            }
            map.put(i, count);
        }
        System.out.println(map);
    }

}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return getName() != null ? getName().equals(person.getName()) : person.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
