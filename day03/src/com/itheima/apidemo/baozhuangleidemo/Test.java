package com.itheima.apidemo.baozhuangleidemo;

public class Test {
    public static void main(String[] args) {
        //基本数据类型 转为 包装类
        int n = 13;
        Integer n1 = n;
        //包装类 转为 基本数据类型
        int n2 = n1;

        //字符串类型 转 基本数据类型
        //方式一  parseInt方法
        int a = Integer.parseInt("13");
        //方式二  valueOf方法
        int b = Integer.valueOf("15");

        //基本数据类型 转 字符串
        String str = n + "";
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(a);
        System.out.println(b);
        System.out.println(str);
    }
}
