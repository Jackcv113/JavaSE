package com.itheima.homework;

import java.util.ArrayList;
import java.util.Iterator;

/*
	11、分析以下需求并完成代码
        使用ArrayList集合存储三个学生对象(姓名，年龄)，使用四种方式遍历集合，打印对象属性
*/
public class Test11 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三",15));
        list.add(new Student("李四",12));
        list.add(new Student("王五",18));
        //方法一：迭代器
        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-----------------------");
        //方法二：增强for
        for (Student s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------------");
        //方法三：foreach
        list.forEach(System.out::println);
    }
}
class Student{
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}