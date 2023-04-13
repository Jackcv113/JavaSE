package com.itheima.implementsdemo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class StudentPlanB implements Operator {
    @Override
    public void printInfo(ArrayList<Student> list) {
        int countMen = 0;
        int countWomen = 0;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            if (list.get(i).getGender() == '男') {
                countMen++;
            } else {
                countWomen++;
            }
        }
        System.out.println("男生人数" + countMen + ",女生人数" + countWomen);

    }

    @Override
    public void printAvg(ArrayList<Student> list) {
        double sumScore = 0;
        int max = list.get(0).getScore();
        int min = list.get(0).getScore();
        for (int i = 0; i < list.size(); i++) {
            sumScore += list.get(i).getScore();
            if (list.get(i).getScore() > max) {
                max = list.get(i).getScore();
            }
            if (list.get(i).getScore() < min) {
                min = list.get(i).getScore();
            }
        }
        System.out.println("全班的平均分是(去掉最高和最低分)：" + ((sumScore - max - min) / (list.size() - 2)));
    }
}
