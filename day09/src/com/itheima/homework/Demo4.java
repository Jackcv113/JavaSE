package com.itheima.homework;

import java.io.*;

/*
    字节流适合做一切类型文件的复制操作
    	任何文件底层都是字节，字节流做复制，是一字不落的转移完全部字节
        只要复制后的文件格式不变，就不会有任何问题

	08、分析以下需求并完成代码
    	C盘根目录下有一个music.mp3文件，现要求通过两种不同方式，将该文件复制到D盘根目录下
 */
public class Demo4 {
    public static void main(String[] args) throws IOException {
        //数据源
        FileInputStream is = new FileInputStream("C:\\music.mp3"); //路径可以修改
        //目的地
        FileOutputStream os = new FileOutputStream("D:\\music.mp3"); //路径可以修改

        /*
            方式一：一次复制一个字节
         */
        int read;
        while ((read = is.read()) != -1) {
            os.write(read);
        }

        /*
            方式二：字节数组实现
         */
        byte[] bytes = new byte[1024 * 8];
        int len;
        while ((len = is.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        //释放资源
        is.close();
        os.close();
    }
}
