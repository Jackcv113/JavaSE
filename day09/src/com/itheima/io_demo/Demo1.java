package com.itheima.io_demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //方式一
        //1.创建文件字节输入流对象
        FileInputStream fis = new FileInputStream("day09\\src\\com\\itheima\\io_demo\\aa");
        //2.获取文件的大小，用文件大小作为数组长度
        File f = new File("day09\\src\\com\\itheima\\io_demo\\aa");
        //3.循环优化 一次读取多个字节数据
        int len = 0;
        byte[] bytes = new byte[(int) f.length()];
        while ((len = fis.read(bytes)) != -1) {
            //通过指定编码解码
            String s = new String(bytes);
            System.out.println(s);
        }
        fis.close();

        //方法二
        //1.创建文件字节输入流对象
        FileInputStream fis1 = new FileInputStream("day09\\src\\com\\itheima\\io_demo\\bb");
        //2.用readAllBytes读取文件全部的字节，返回到一个数组当中
        byte[] bytes1 = fis1.readAllBytes();
        //通过默认编码解码
        String s = new String(bytes1);
        System.out.println(s);
        fis1.close();
    }
}
