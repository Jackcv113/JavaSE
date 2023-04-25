package com.itheima.homework;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        String info = "黑马程序员";
        byte[] bytes = info.getBytes("GBK");
        System.out.println(Arrays.toString(bytes));
        //解码
        String s = new String(bytes);
        System.out.println(s);
    }
}
