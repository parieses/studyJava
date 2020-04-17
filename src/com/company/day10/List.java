package com.company.day10;

public class List {
    public static void main(String[] args) {
        java.util.List<String> list = new java.util.ArrayList<String>();
        list.add("达瓦");
        list.add("达粉色瓦");
        list.add("和认同和");
        list.add("达粉色瓦");//允许使用重复元素
        System.out.println(list);
        System.out.println(list.get(1));//可以通过索引访问指定位置的集合
        list.add(1, "达瓦大");//指定索引位置插入式数据
        java.util.List<String> l = new java.util.ArrayList<String>();
        l.add("111");
        l.add("222");
        list.addAll(3, l);//在指定位置插入集合
        System.out.println(list);
        System.out.println(list.indexOf("达瓦大"));//获取元素在集合在第一次出现的坐标
        System.out.println(list.lastIndexOf("达瓦大"));//最后一次出现的坐标
        list.remove(1);//移除元素
        list.set(1, "改值");
        System.out.println(list);
        System.out.println(list.subList(1, 2));//包含开始不包含结束
        System.out.println(list.size());
    }
}
