package com.itheima.homework;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Test2 {
    public static void main(String[] args) {

        Inter inter = (a, b) -> a/ b;
        System.out.println(inter.divide(10,4));
    }
}
interface Inter{
    double divide(double a, double b);
}