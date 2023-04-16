package com.itheima.Bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Demo {
    public static void main(String[] args) {
// 1、把浮点型数据封装成BigDecimal对象，再来参与运算。
// a、public BigDecimal(double val) 得到的BigDecimal对象是无法精确计算浮点型数据的。 注意：不推荐使用这个，
// b、public BigDecimal(String val)  得到的BigDecimal对象是可以精确计算浮点型数据的。 推荐使用。
        double a = 11.5;
        double b = 11.3;
        BigDecimal bd1 = new BigDecimal(a);
        System.out.println(new BigDecimal(a));
        String s = a + "";
        String s2 = b + "";
        BigDecimal bd2 = new BigDecimal(s);
        BigDecimal bd3 = new BigDecimal(s2);
        System.out.println(new BigDecimal(s));
// 2、public BigDecimal add(BigDecimal augend): 加法
        System.out.println(bd1.add(bd2));
// 3、public BigDecimal subtract(BigDecimal augend): 减法
        System.out.println(bd1.subtract(bd2));
// 4、public BigDecimal multiply(BigDecimal augend): 乘法
        System.out.println(bd1.multiply(bd2));
// 5、public BigDecimal divide(BigDecimal b): 除法
        // System.out.println(bd2.divide(bd3));
// 6、public BigDecimal divide(另一个BigDecimal对象，精确几位，舍入模式:RoundingMode.HALF_UP) : 除法，可以设置精确几位。
        System.out.println(bd1.divide(bd3, 2, RoundingMode.HALF_UP));
// 7、public double doubleValue() : 把BigDecimal对象又转换成double类型的数据。
        double v = bd1.doubleValue();
        System.out.println(v);


    }
}
