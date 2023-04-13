package com.itheima.ploydemo1;

public class Test {
    public static void main(String[] args) {
        People s1 = new Student();
        People t1 = new Teacher();
        //成员方法
        //编译看左边，运行看右边
        s1.run();
        t1.run();
        //成员变量
        //编译看左边，运行看右边
        System.out.println(s1.name);
        System.out.println(t1.name);
        System.out.println("=============================");
        if (t1 instanceof Teacher t2) {
            t2.skill();
        }
        Student s2 = s1 instanceof Student ? (Student) s1 : null;
        s2.kill();

    }
}
