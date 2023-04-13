package com.itheima.extendsdemo1;

public class Teacher extends People{
    public Teacher() {
    }

    public Teacher(String name, int age, char gender, double height, double weight) {
        super(name, age, gender, height, weight);
    }

    public void skillEnglish(){
        System.out.println("教英语");
    }
}
