package com.itheima.obstractdemo1;

public abstract class People {
    String name;

    public People() {
    }


    public final void info() {
        System.out.println("我要自我介绍了：");
        shenfen();
        System.out.println("我介绍完毕了~");
    }

    public abstract void shenfen();
}
