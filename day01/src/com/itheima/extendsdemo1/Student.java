package com.itheima.extendsdemo1;

public class Student extends People{
    public Student() {
    }

    public Student(String name, int age, char gender, double height, double weight) {
        super(name, age, gender, height, weight);
    }

    public void hobby(){
        System.out.println("做运动");
    }
}
