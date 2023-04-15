package com.itheima.enumdemo;

public class Test {
    public static void main(String[] args) {
        //使用枚举: 可以对传入的参数值进行限制
        command(Choose.BOY);
    }
    //推荐方法，根据性别推荐对应的数据
    public static void command(Choose c){
        switch (c){
            case BOY -> System.out.println("给男生推荐的书");
            case GIRL -> System.out.println("给女生推荐的书");
        }
    }
}
