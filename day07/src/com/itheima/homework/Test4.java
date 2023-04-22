package com.itheima.homework;

public class Test4 {
    public static void main(String[] args) {
        String str = "{\"《红楼梦》-曹雪芹\",\"《西游记》-吴承恩\",\"《三国演义》-罗贯中\",\"《水浒传》-施耐庵\"}";
        String s = str.replaceAll("\"", "").replaceAll("\\{","").replaceAll("\\}","");
        System.out.println(s);
    }
}
