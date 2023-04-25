package com.itheima.io_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1.创建输出和输入两个对象
             fis = new FileInputStream("D:\\黑马资料\\隔扣詹姆斯.wmv");
             fos = new FileOutputStream("D:\\黑马资料\\作业\\隔扣詹姆斯.wmv");
            //2.通过字节数组，读取目标文件
        /*
        byte[] bytes = fis.readAllBytes();
        fos.write(bytes);
        */
            byte[] bytes = new byte[1024 * 8];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //3.关流：从内向外关
            fos.close();
            fis.close();
        }
    }
}
