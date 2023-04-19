package com.itheima.homework;

public class Test2 {
    public static void main(String[] args) {
        String[] arr = new String[3];
        method(arr);
    }

    public static void method(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == 3) {
                System.out.println(arr[i]);
            }
        }
    }
}
