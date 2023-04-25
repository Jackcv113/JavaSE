package com.itheima.io_demo;

public class MyResource implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("资源被释放了");
    }
}
