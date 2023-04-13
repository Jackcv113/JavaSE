package com.itheima.staticdemo3;

public class Test {
    public static void main(String[] args) {
        //饿汉式单例
        //在调用方法之前，就已经创建了对象，更节省时间
        AA a1 = AA.getInstance();
        AA a2 = AA.getInstance();
        System.out.println(a1);
        System.out.println(a2);

        //懒汉式单例
        //只有调用方法时，才开始创建对象，更节省内存
        BB b1 = BB.getInstance();
        BB b2 = BB.getInstance();
        System.out.println(b1);
        System.out.println(b2);
    }
}
