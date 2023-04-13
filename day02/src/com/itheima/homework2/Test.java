package com.itheima.homework2;

public class Test {
    public static void main(String[] args) {
        Door d1 = new WoodDoor();
        d1.brand="asd";
        d1.height =213;
        d1.width =11;
        d1.close();
        d1.open();
        Door d2 = new ElectricAlarmDoor();
        d2.open();
        d2.close();

        ElectricAlarmDoor e = new ElectricAlarmDoor();
        e.brand = "asd";
        e.height = 13;
        e.width =15;
        e.Alarm();
    }
}
