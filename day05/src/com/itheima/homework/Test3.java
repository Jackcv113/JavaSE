package com.itheima.homework;

import java.util.Arrays;

public class Test3 {
    /*
        04、分析以下需求并完成代码
        阅读代码,通过自然排序完成：按照语文成绩升序排列,语文成绩相同,则按继续比英语成绩
        将自然排序相关代码注释,然后通过比较器排序完成：按照年龄升序排列,年龄相同比姓名
        遍历集合,打印对象属性查看结果
*/
    private static Student[] stus = new Student[6];

    static {
        stus[0] = new Student("zhangsan", 17, 99, 77);
        stus[1] = new Student("lisi", 21, 85, 86);
        stus[2] = new Student("wangwu", 20, 75, 94);
        stus[3] = new Student("zhaoliu", 17, 75, 95);
        stus[4] = new Student("qianqi", 19, 66, 44);
        stus[5] = new Student("yanzu", 18, 75, 86);
    }

    public static void main(String[] args) {
        //3、通过比较器排序完成：按照年龄升序排列,年龄相同比姓名
        Arrays.sort(stus);

        //2、遍历集合,打印对象属性查看结果
        System.out.println(Arrays.toString(stus));
    }
}

//1、通过自然排序完成：按照语文成绩升序排列,语文成绩相同,则按继续比英语成绩（注释掉再写比较器排序）
class Student implements Comparable<Student> {
    //阅读其他代码,完成就javabean的编写
    private String name;
    private int age;
    private int chinese;
    private int english;

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

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chinese=" + chinese +
                ", english=" + english +
                '}';
    }

    public Student() {
    }

    public Student(String name, int age, int chinese, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.english = english;
    }

    @Override
    public int compareTo(Student o) {
        //按照年龄和姓名排序
        if (this.getAge() - o.getAge() != 0) {
            return this.getAge() - o.getAge();
        } else {
            return o.getName().compareTo(this.getName());
        }

        //按照语文和英语成绩排序
        /*if (this.getChinese() - o.getChinese() != 0) {
            return this.getChinese() - o.getChinese();
        } else {
            return this.getEnglish() - o.getEnglish();
        }*/
    }
}
