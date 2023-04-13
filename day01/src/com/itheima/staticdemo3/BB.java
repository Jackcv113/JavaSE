package com.itheima.staticdemo3;

public class BB {
    //懒汉式单例

    //2.定义类变量
    static BB bb;

    //1.私有构造器
    private BB(){

    }
    //3.创建类方法，返回对象
    public static BB getInstance(){
        //必须要进行一个判断，不然每调用一次都会创建一个新的对象
        if (bb == null){
            bb = new BB();
        }
        return bb;
    }
}
