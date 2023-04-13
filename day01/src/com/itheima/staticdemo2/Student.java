package com.itheima.staticdemo2;

import java.util.ArrayList;

public class Student {
    int age;
    static ArrayList<Integer> list;

    //静态代码块----随着类的加载而加载
    //被static 修饰的，只能使用static的
    static {
        System.out.println("静态代码块执行了~~~");
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    }

    //实例代码块----创建对象时加载，并且优先于构造器加载
    {
        System.out.println("实例代码块执行了~");
        age = 20;
    }
    public Student(){
        System.out.println("无参构造方法执行了~");
    }
    public Student(int age){
        System.out.println("有参构造方法执行了！");
        this.age = age;
    }

}
