package com.itheima.staticdemo2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        System.out.println(Student.list);
        Student s1 = new Student();
        Student s2 = new Student(18);
        System.out.println(s1.age);
        System.out.println(s2.age);
        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        System.out.println(list);
    }
}
