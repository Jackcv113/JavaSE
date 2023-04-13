package com.itheima.homework;

public class Coder extends Employee{
    public Coder() {
    }

    public Coder(String workID, String name, int age) {
        super(workID, name, age);
    }
    @Override
    public void work(){
        System.out.println("工号为"+getWorkID()+"的程序员"+
                getName()+"根据需求完成代码，"+getAge()+"岁就月薪过万了");
    }
}
