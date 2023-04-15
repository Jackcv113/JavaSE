package com.itheima.apidemo.objectdemo;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 16);
        Student s2 = new Student("zhangsan", 16);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
    }
}

 class Student{
  private   String name;
  private   int age;

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Student student = (Student) o;
         return age == student.age && Objects.equals(name, student.name);
     }

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
 }
