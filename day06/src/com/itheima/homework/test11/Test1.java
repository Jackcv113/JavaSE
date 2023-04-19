package com.itheima.homework.test11;

public class Test1 {
    public static void main(String[] args) {
        String[] arr = "张三,18,西安".split("，");
        Student stu = new Student(arr[0],Integer.parseInt(arr[1]),arr[2]);
        System.out.println(stu);
    }
}
class Student{
   private String name;
   private int age;
   private String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}