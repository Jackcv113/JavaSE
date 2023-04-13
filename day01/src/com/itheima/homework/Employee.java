package com.itheima.homework;

public abstract class Employee {
   private String workID;
   private String name;
   private int age;

    public String getWorkID() {
        return workID;
    }

    public void setWorkID(String workID) {
        this.workID = workID;
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

    public Employee() {
    }

    public Employee(String workID, String name, int age) {
        this.workID = workID;
        this.name = name;
        this.age = age;
    }
    public abstract void work();
}
