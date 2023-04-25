package com.itheima.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("day09\\src\\com\\itheima\\homework"));
        fos.write("黑马程序员".getBytes());
        fos.close();
    }
}
