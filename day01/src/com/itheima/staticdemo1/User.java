package com.itheima.staticdemo1;

public class User {
    //类变量----可被多个成员变量共享
    private static int count;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        User.count = count;
    }

    public User(){
        count++;
    }
}
