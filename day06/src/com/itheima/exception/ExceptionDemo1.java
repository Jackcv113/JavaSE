package com.itheima.exception;

public class ExceptionDemo1 {
    public static void main(String[] args) throws AgeException {
        //捕获异常
        try {
            showException();
        } catch (AgeException e) {
            System.out.println("emmmmm~~");
            throw new RuntimeException(e);
        }

        //抛出异常
/*
        showException();
*/
        System.out.println("哈哈哈！！");
    }
public static void showException() throws AgeException {
        int age = 188;
        if (age >= 0 && age <= 150){
            System.out.println("年龄合法");
        }else {
            //手动抛出一个异常：代表年龄不合法
            throw new AgeException(age + "不合法！");
        }
}
}
