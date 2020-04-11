package com.company;

import java.util.Arrays;

//提示：每次入栈之前先判断栈的容量是否够用，如果不够用就用Arrays.copyOf()进行扩容；
public class MyStack {
    private  int[] storage;//存放栈中元素的数组
    private  int capacity;//栈的容量
    private  int count;//栈中元素数量
    private static final int GROW_FACTOR = 2;
    //TODO:不带初始化容量的构造方法 默认容量 8
    public MyStack(){
        this.capacity = 8;
        this.storage = new int[8];
        this.count = 0;
    }
    //TODO:带初始化容量的构造方法
    public MyStack(int initialCapacity){
        if (initialCapacity < 1)
            throw new  IllegalArgumentException("容量太小了");
        this.capacity = initialCapacity;
        this.storage = new int[initialCapacity];
        this.count = 0;
    }
    //TODO: 入栈
    public void push(int value) {
        if (count == capacity){
            ensureCapacity();
        }
        storage[count++] = value;
    }
    //TODO:确保容量大小
    private void ensureCapacity(){
        int newCapacity = capacity * GROW_FACTOR;
        storage = Arrays.copyOf(storage, newCapacity);
        capacity = newCapacity;
    }
    //TODO：返回栈顶元素并出栈
    int pop() {
        if (count == 0)
            throw new IllegalArgumentException("Stack is empty.");
        count--;
        return storage[count];
    }
    //TODO:返回栈顶元素不出栈
    int peek(){
        if (count == 0){
            throw new IllegalArgumentException("Stack is empty.");
        }else{
            return storage[count-1];
        }
    }
    //TODO:判断栈是否为空
    boolean isEmpty(){
        return count == 0;
    }
    //TODO:返回栈中元素个数
    int size(){
        return count;
    }
}
