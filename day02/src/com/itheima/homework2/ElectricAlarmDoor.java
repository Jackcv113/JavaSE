package com.itheima.homework2;

public class ElectricAlarmDoor extends Door{
    @Override
    void open() {
        System.out.println("报警门打开了！！");
    }

    @Override
    void close() {
        System.out.println("报警门又关上了！！！");
    }

    public void Alarm(){
        System.out.println("报警门报警啦，芜湖~~");
    }
}
