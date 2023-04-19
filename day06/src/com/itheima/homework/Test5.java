package com.itheima.homework;

public class Test5 {
    public static void main(String[] args) {
        method(new Dog());
        method(new Cat());

    }
    public static void method(Animal a){

        if (a instanceof Dog){
            Dog d =(Dog) a;
            d.lookDoor();
        }

    }
}
class Animal{}
class Cat extends Animal{}
class Dog extends Animal{
    public void lookDoor(){
        System.out.println("Dog特有功能：看门");
    }
}