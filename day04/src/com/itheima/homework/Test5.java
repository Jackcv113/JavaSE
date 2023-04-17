package com.itheima.homework;

public class Test5 {
    public static void main(String[] args) {
        /*
    05、分析以下需求并完成代码
        设计方法，将任意类型数组的元素，进行拼接，格式要求：[元素1, 元素2, 元素3..]
        使用StringBuilder完成
        main方法中分别提供整数、字符串、学生对象数组，对两个方法进行测试
*/
        //测试数据
        Integer[] inArray = {1,2,3};
        String[] stringArray = {"java","c++","python"};
        Student[] stuArray = {new Student("张三"),new Student("李四"),new Student("王五")};
        //测试方法
        System.out.println(getArr(inArray));
        System.out.println(getArr(stringArray));
        System.out.println(getArr(stuArray));

    }
    //StringBuilder实现的方法
    public static String getArr(Object[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length-1; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.append(arr[arr.length-1]).append("]");
        return sb.toString();
    }
}
class  Student{
    private String name;
    public  Student(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}