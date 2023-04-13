package com.itheima.ploydemo1;

public class Student extends People{
    String name = "小庄";

    @Override
    public void run() {
        System.out.println("学生在狂飙~~~~~");
    }
    public void kill(){
        System.out.println("学生正在用千鸟打你的屁股~~~~");
    }
}
