package com.itheima.homework;

import java.util.Comparator;
import java.util.TreeSet;

/*
    07、分析以下需求并完成代码
        使用TreeSet存储学生对象，按照年龄进行升序排列，如果年龄相同，按照姓名首字母字典排序
        分别使用自然排序，和比较器排序两种方式实现，学生信息如下
            new Student("zhangsan", 24);
            new Student("lisi", 18);
            new Student("wangwu", 24);
            new Student("wangwu", 24);
            new Student("chenglong", 58);
*/
public class Test2 {
    public static void main(String[] args) {
        //1.比较器
        /*TreeSet<Student> set = new TreeSet<>((o1, o2) -> o1.getAge() - o2.getAge() !=0 ? o1.getAge()
                - o2.getAge():o1.getName().compareTo(o2.getName()));*/
        //2.接口
        TreeSet<Student> set = new TreeSet<>();
        set.add(new Student("zhangsan", 24));
        set.add(new Student("wangwu", 24));
        set.add(new Student("wangwu", 24));
        set.add(new Student("chenglong", 58));
        for (Student student : set) {
            System.out.println(student);
        }
    }
}
