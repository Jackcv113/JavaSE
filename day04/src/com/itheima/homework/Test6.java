package com.itheima.homework;

public class Test6 {
    public static void main(String[] args) {
        /*
            06、分析以下需求并完成代码
            设计一个方法，判断传入的字符串是否对称，并打印判断结果，测试如下数据
        	对称格式："123321"、"45654"、"abcba"
        	不对称格式："12345"、"abc"
*/
        String s1 = "123321";
        String s2 = "45654";
        String s3 = "abcba";
        System.out.println(isHuiWen(s1));
        System.out.println(isHuiWen(s2));
        System.out.println(isHuiWen(s3));

        String s4 = "12345";
        String s5 = "abc";
        System.out.println(isHuiWen(s4));
        System.out.println(isHuiWen(s5));


    }
    public static boolean isHuiWen(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        return str.equals(sb.reverse().toString());
    }
}
