package com.itheima;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BiConsumer;

public class HashSetDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("蜘蛛精", 162.5);
        map.put("蜘蛛精", 169.0);
        map.put("紫霞", 165.8);
        map.put("至尊宝", 167.7);
        map.put("牛魔王", 183.1);
        System.out.println(map);
        //方式一：键找值
        Set<String> key = map.keySet();
        for (String s : key) {
            Double value = map.get(s);
            System.out.println(s + "------" + value);
        }
        //方式二：键值对
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            String s = entry.getKey();
            Double value = entry.getValue();
            System.out.println(s + "------" + value);
        }
        //方式三：Lambda表达式
        map.forEach((s, aDouble) -> System.out.println(s + "---------" + aDouble));
    }
}
