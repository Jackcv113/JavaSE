package com.itheima.apidemo.baozhuangleidemo;

public class dd {
    public static void main(String[] args) {

        Integer a = -128;//自动装箱：Integer会自动调用ValueOf方法
        Integer b = -128;
        System.out.println(a == b);
        /*
        jdk设计者认为byte范围内的整数-128~127，为了避免内存消耗，底层创建了Integer数组，存储的-128~127这256个Integer对象
        这个数组也称之为整型缓冲池。
        后续不管创建多少个Integer对象，只要在-128~127之间，都会先去整型缓冲池中查找。并且复用。
        如果不在范围内，会new新的Integer对象；
         */
    }
}
