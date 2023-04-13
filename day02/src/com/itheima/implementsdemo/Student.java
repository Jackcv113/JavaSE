package com.itheima.implementsdemo;

public class Student {
    private String name;
    private char gender;
    private int score;

    @Override
    public String toString() {
        return
                "姓名='" + name + '\'' +
                        ", 性别=" + gender +
                        ", 分数=" + score
                ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student() {
    }

    public Student(String name, char gender, int score) {
        this.name = name;
        this.gender = gender;
        this.score = score;
    }
}
