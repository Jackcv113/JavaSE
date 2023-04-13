package com.itheima.extendsdemo1;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("小明",18,'男',185,200);
        s1.hobby();
        System.out.println(s1.toString());

        Teacher t1 = new Teacher("大壮",46,'男',180,180);
        t1.skillEnglish();
        System.out.println(t1.toString());
    }
}
