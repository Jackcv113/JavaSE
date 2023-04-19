package com.itheima.homework;

import java.util.Arrays;

public class Test6 {
    /*
           07、分析以下需求并完成代码  选做
    		现有字符串"古力娜扎ai8888迪丽热巴999aa5566马尔扎哈fbbfsfs425425卡尔扎巴"
			1、使用正则表达式，将字符串中的，非中文字符替换为"-"
			2、使用正则表达式，将字符串中的，中文人名获取出来
*/
    public static void main(String[] args) {
        String str1 = "古力娜扎ai8888迪丽热巴999aa5566马尔扎哈fbbfsfs425425卡尔扎巴";
        String regex1 = "\\w";
        System.out.println(str1.replaceAll(regex1, "-"));

        System.out.println(str1);
        String[] split = str1.split("\\w+");
        System.out.println(Arrays.toString(split));
    }
}
