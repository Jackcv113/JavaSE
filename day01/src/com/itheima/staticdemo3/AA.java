package com.itheima.staticdemo3;

public class AA {
    //饿汉式单例

    //2.创建静态对象
    static AA aa = new AA();

    //1.私有化构造器
    private AA() {

    }

    //3.用类方法返回对象
    public static AA getInstance() {
        return aa;
    }
}
