package com.itheima.StringJonier;

import java.util.StringJoiner;

public class Demo {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        int[] arr = {11, 22, 33};
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str = String.valueOf(arr[i]);
            sj.add(str);
        }

        System.out.println(sj);
    }
}
