package com.itheima.homework;

public class Manager extends Employee{
    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Manager(int bonus) {
        this.bonus = bonus;
    }

    public Manager(String workID, String name, int age, int bonus) {
        super(workID, name, age);
        this.bonus = bonus;
    }
    @Override
    public void work(){
        System.out.println("工号为"+getWorkID()+"的项目经理"+getName()+
                "在和客户谈需求，项目奖金"+getBonus()+"但是"+getAge()+"岁还没有结婚");
    }
}
