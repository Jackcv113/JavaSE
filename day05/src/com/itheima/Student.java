package com.itheima;

public class Student{
   private String name;
   private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //方法一
    //实现接口
    //在类中重写compareTo方法
    /*@Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }*/
}
