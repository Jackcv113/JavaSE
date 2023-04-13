package com.itheima.homework2;

public class WoodDoor extends Door{
    @Override
    void open() {
        System.out.println("木门开了~~");
    }

    @Override
    void close() {
        System.out.println("木门又关上了~~");
    }
}
