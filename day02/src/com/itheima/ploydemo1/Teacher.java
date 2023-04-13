package com.itheima.ploydemo1;

public class Teacher extends People{
    String name = "大壮";
    @Override
    public void run() {
        System.out.println("老师在狂奔~~");
    }
    public void skill(){
        System.out.println("老师正在搓丸子~~~~");
    }
}
