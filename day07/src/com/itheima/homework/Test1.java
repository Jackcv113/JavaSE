package com.itheima.homework;

import java.util.HashSet;
import java.util.Objects;

/*
	06、分析以下需求并完成代码
		使用HashSet存储学生对象(姓名，年龄)，属性相同认为是同一个对象则不存
*/
public class Test1 {
    public static void main(String[] args) {
        //使用HashSet存储学生对象
        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student("zhangsan", 12);
        Student s2 = new Student("lisi", 15);
        Student s3 = new Student("wangwu", 17);
        Student s4 = new Student("zhangsan", 12);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        //遍历集合
        for (Student stu : set) {
            System.out.println(stu);
        }
    }
}
