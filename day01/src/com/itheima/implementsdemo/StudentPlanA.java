package com.itheima.implementsdemo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class StudentPlanA implements Operator {



    @Override
    public void printInfo(ArrayList<Student> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Override
    public void printAvg(ArrayList<Student> list) {
        double sumScore = 0;
        for (int i = 0; i < list.size(); i++) {
            sumScore += list.get(i).getScore();
        }
        BigDecimal bd = BigDecimal.valueOf(sumScore);
        BigDecimal bd2 = BigDecimal.valueOf(list.size());
        BigDecimal bd3 = bd.divide(bd2, 2, RoundingMode.HALF_UP);

        System.out.println("全班的平均分是：" +bd3);
    }
}
