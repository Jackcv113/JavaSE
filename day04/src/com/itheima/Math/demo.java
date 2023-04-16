package com.itheima.Math;

public class demo {
    public static void main(String[] args) {

        // 1、public static int abs(int a)：取绝对值（拿到的结果一定是正数）
        System.out.println(Math.abs(-15));
        // 2、public static double ceil(double a): 向上取整
        System.out.println(Math.ceil(11.1));
        // 3、public static double floor(double a): 向下取整
        System.out.println(Math.floor(11.9));
        // 4、public static long round(double a)：四舍五入
        System.out.println(Math.round(13.5));
        System.out.println(Math.round(13.4));
       // 5、public static int max(int a, int b)：取较大值
        System.out.println(Math.max(11, 15));
       //   public static int min(int a, int b)：取较小值
        System.out.println(Math.min(11, 15.5));
        // 6、 public static double pow(double a, double b)：取次方
        System.out.println(Math.pow(2, 3));
        // 7、public static double random()： 取随机数 [0.0 , 1.0) (包前不包后)
        System.out.println(Math.random());
    }
}
