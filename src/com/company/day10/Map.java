package com.company.day10;

import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        java.util.Map<String, Integer> map = new java.util.HashMap<String, Integer>();
        map.put("B", 1);
        map.put("C", 1);
        map.put("A", 2);
        System.out.println(map);
        System.out.println(map.get("B"));
        map.remove("C");
        map.size();//大小
        map.containsKey("B");//判断存不存在这个key
        map.containsValue(1);//判断存不存在这个value
        //遍历map集合
        Set<String> key = map.keySet();//获取map集合的key集合
        for (String k : key) {
            System.out.println("k: " + k + " ,value " + map.get(k));
        }
        //通过entrySet 循环
        Set<java.util.Map.Entry<String, Integer>> entry = map.entrySet();
        for (java.util.Map.Entry<String, Integer> en : entry) {
            System.out.println(en);
            System.out.println(en.getKey() + " " + en.getValue());

        }
        //默认排序 自然排序  字典排序
        java.util.Map<Integer, Integer> map1 = new TreeMap<Integer, Integer>();
        map1.put(1, 1);
        map1.put(2, 2);
        map1.put(3, 1);
        map1.put(4, 2);
        System.out.println(map1);
    }
}
