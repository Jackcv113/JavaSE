package com.itheima.LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalField;

public class Demo {
    public static void main(String[] args) {
        // 0、获取本地日期和时间对象 now()。
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        // 5、获取指定日期和时间的LocalDateTime对象：
        // public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour,int minute, int second, int nanoOfSecond)
        LocalDateTime of = LocalDateTime.of(2077, 4, 15, 11, 11);
        System.out.println(of);
        // 1、可以获取日期和时间的全部信息
        int year = now.getYear();
        int hour = now.getHour();
        System.out.println(year);
        System.out.println(hour);
        // 2、修改时间信息：
        // withYear withMonth withDayOfMonth withDayOfYear withHour
        // withMinute withSecond withNano
        LocalDateTime newYear = now.withYear(2077);
        System.out.println(newYear);
        // 3、加多少:
        // plusYears  plusMonths plusDays plusWeeks plusHours plusMinutes plusSeconds plusNanos
        LocalDateTime localDateTime = newYear.plusYears(11);
        System.out.println(localDateTime);
        // 4、减多少：
        // minusDays minusYears minusMonths minusWeeks minusHours minusMinutes minusSeconds minusNanos
        // 6、 判断2个日期、时间对象，是否相等，在前还是在后： equals、isBefore、isAfter
        System.out.println(newYear.equals(localDateTime));
        System.out.println(newYear.isBefore(localDateTime));
        // 7、可以把LocalDateTime转换成LocalDate和LocalTime
        // public LocalDate toLocalDate()
        // public LocalTime toLocalTime()
        // public static LocalDateTime of(LocalDate date, LocalTime time)

        LocalDate localDate = newYear.toLocalDate();
        System.out.println(localDate);

        System.out.println(newYear.toLocalTime());
    }
}
