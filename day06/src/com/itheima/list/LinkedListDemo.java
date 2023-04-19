package com.itheima.list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        //使用LinkedList模拟队列结构，先进先出
        LinkedList<String> list = new LinkedList<>();
        //入队
        list.addFirst("1号买票");
        list.addFirst("2号买票");
        list.addFirst("3号买票");
        list.addFirst("4号买票");
        System.out.println(list);
        //出队
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());

        System.out.println("-------------------------------------");
        //使用LinkedList模拟队列结构，先进先出
        //进站
        list.addFirst("1号子弹");
        list.addFirst("2号子弹");
        list.addFirst("3号子弹");
        list.addFirst("4号子弹");
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());

    }
}
