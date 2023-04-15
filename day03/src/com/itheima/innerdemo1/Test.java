package com.itheima.innerdemo1;

public class Test {
    public static void main(String[] args) {
        //匿名内部类
        goSwim(new Swimming() {
            @Override
            public void swim() {
                System.out.println("潜水1000天~~");
            }
        });
    }
    public static void goSwim(Swimming c){
        c.swim();
    }
}
