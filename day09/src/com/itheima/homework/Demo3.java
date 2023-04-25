package com.itheima.homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("day09\\src\\com\\itheima\\homework\\a.txt");
        byte[] bytes = new byte[3];
        int len;
        /*while ((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }*/
        byte[] bytes1 = is.readAllBytes();
        System.out.println(new String(bytes1));
        is.close();
    }
}
