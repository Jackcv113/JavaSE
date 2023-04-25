package com.itheima.io_demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) {
        //1.创建输出和输入两个对象
        try(MyResource myResource = new MyResource(); FileInputStream fis = new FileInputStream("D:\\黑马资料\\隔扣詹姆斯.wmv"); FileOutputStream fos = new FileOutputStream("D:\\黑马资料\\作业\\隔扣詹姆斯.wmv")) {
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
            System.out.println(10/0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
