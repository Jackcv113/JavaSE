package com.itheima.homework;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        arr[0] = new Car(1000000);
        arr[1] = new Car(80000);
        arr[2] = new Car(1650000);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
class Car implements Comparable<Car>{
    private int price;

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Car o) {
        return o.getPrice() - this.getPrice();
    }
}