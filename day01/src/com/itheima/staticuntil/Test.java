package com.itheima.staticuntil;

public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        //调用工具类的方法
        //类名.类方法
        int sum = SumUntil.getSum(10, 11);
        System.out.println(sum);
    }
}
