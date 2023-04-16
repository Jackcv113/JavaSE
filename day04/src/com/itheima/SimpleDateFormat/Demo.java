package com.itheima.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ParseException {
        //比较是否超时
        //1.将时间有String变量接收
        String startTime = "2023年11月11日 00时00分00秒";
        String endTime = "2023年11月11日 00时10分00秒";
        String jiaTime = "2023年11月11日 00时01分18秒";
        String piTime = "2023年11月11日 00时10分51秒";
        //2.创建SimpleDateFormat对象，转换成Date类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date startD = sdf.parse(startTime);
        Date endD = sdf.parse(endTime);
        Date jiaD = sdf.parse(jiaTime);
        Date piD = sdf.parse(piTime);
        //3.调用getTime方法获取毫秒值，再进行判断
        if (jiaD.getTime() >= startD.getTime() && jiaD.getTime() <= endD.getTime()) {
            System.out.println("小贾参加了活动~~");
        } else {
            System.out.println("小贾没参加上活动~~~");
        }
        if (piD.getTime() >= startD.getTime() && piD.getTime() <= endD.getTime()) {
            System.out.println("小皮参加了活动~~");
        } else {
            System.out.println("小皮没参加上活动~~~");
        }
    }
}
