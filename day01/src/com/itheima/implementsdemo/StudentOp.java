package com.itheima.implementsdemo;

import java.util.ArrayList;

public class StudentOp {
    private static ArrayList<Student> list;
    private Operator op = new StudentPlanB();
    static {
        list = new ArrayList<>();
        list.add(new Student("小明", '男', 99));
        list.add(new Student("小红", '女', 94));
        list.add(new Student("小蛋", '男', 76));
    }
    public void printInfo(){
        op.printInfo(list);
    }
    public void printAvg(){
        op.printAvg(list);
    }

}
