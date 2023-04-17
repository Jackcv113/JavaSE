package com.itheima.homework;


import javax.swing.text.DateFormatter;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;


public class Test7 {
    public static void main(String[] args) {
        /*
	    07、分析以下需求并完成代码
        请使用代码实现计算你活了多少天，目前多少岁
*/
        //定义出生日期
        String both = "1999-03-06";
        //转换成LocalDate
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate bothLd = LocalDate.parse(both, dtf);
        System.out.println(bothLd);


        LocalDate now = LocalDate.now();
        System.out.println(now);


        //多少天
        long days = bothLd.until(now, ChronoUnit.DAYS);
        System.out.println(days);
        //多少年
        long years = bothLd.until(now, ChronoUnit.YEARS);
        System.out.println(years);
    }
}
