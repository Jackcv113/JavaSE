package com.itheima.enumdemo;

public class Test {
    public static void main(String[] args) {
        command(Choose.BOY);
    }

    public static void command(Choose c){
        switch (c){
            case BOY -> System.out.println("给男生推荐的书");
            case GIRL -> System.out.println("给女生推荐的书");
        }
    }
}
