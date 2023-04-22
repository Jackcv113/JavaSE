package com.itheima;

import java.util.HashSet;
import java.util.Objects;

public class HashSetDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog("黑色", 3);
        Dog d2 = new Dog("黑色", 3);
        Dog d3 = new Dog("黄色", 3);
        HashSet<Object> hs = new HashSet<>();
        hs.add(d1);
        hs.add(d2);
        hs.add(d3);
        System.out.println(hs);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
class Dog{
   private String color;
   private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String color, int age) {
        this.color = color;
        this.age = age;
    }
}