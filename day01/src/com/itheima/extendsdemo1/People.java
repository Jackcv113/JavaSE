package com.itheima.extendsdemo1;

public class People {
   private String name;
   private int age;
   private char gender;
   private double height;
   private double weight;

    @Override
    public String toString() {
        return "People{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 性别=" + gender +
                ", 身高=" + height +
                ", 体重=" + weight +
                '}';
    }

    public People() {
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public People(String name, int age, char gender, double height, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }
}
