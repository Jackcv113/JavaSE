package com.itheima.obstractdemo1;

public class Teacher extends People{
    String skill;

    public Teacher() {
    }

    @Override
    public void shenfen() {
        System.out.println("我是一个老师~");
    }
}
