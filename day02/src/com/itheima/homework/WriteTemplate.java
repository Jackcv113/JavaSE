package com.itheima.homework;

public abstract class WriteTemplate {
    public final void write(){
        System.out.println("《我的爸爸》");
        body();
        System.out.println("啊~这就是我的爸爸！");
    }
     abstract void body();
}
