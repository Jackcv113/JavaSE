package com.itheima.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo1 {
    public static void main(String[] args) {
        double[] brr = {11, 22, 33, 44};
        /*Arrays.setAll(brr, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return brr[value] +1;
            }
        });*/
        //lambda简写
        Arrays.setAll(brr, value -> brr[value] + 1);
        System.out.println(Arrays.toString(brr));


        System.out.println("---------------------------------");
        Student s1 = new Student("张三", 25);
        Student s2 = new Student("李四", 21);
        Student s3 = new Student("王五", 27);
        Student s4 = new Student("赵一", 22);

        Student[] arr = {s1, s2, s3, s4};
        System.out.println(Arrays.toString(arr));

        //方法一
        //Arrays.sort(arr);
        //Student类中实现Comparable接口，并重写CompareTo方法

        //方法二
        //用sort中的重载方法
        //用匿名内部类创建Comparator对象，并重写compare方法
        /*Arrays.sort(arr, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });*/
        //lambda简写
        //Arrays.sort(arr, ( o1,  o2) -> o1.getAge() - o2.getAge());
        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
