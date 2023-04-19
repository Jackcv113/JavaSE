package com.itheima.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("1号买票");
        list.addFirst("2号买票");
        list.addFirst("3号买票");
        list.addFirst("4号买票");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1号买票");
        list1.add("2号买票");
        list1.add("3号买票");
        list1.add("4号买票");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list1.get(i));
        }


    }
}
