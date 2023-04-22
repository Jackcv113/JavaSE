package com.itheima;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashSetDemo2 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        String[] arr = {"A", "B", "C", "D"};
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            l.add(arr[index]);
        }
        System.out.println(l);
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < l.size(); i++) {
            String s = l.get(i);
            //判断map集合中的key是否包含本次循环的景点名称s
            if (map.containsKey(s)) {//如果包含，说明该key已经存在
                Integer num = map.get(s);//用key调用value
                map.put(s, num + 1);//重新给该key赋值value+1
            } else {//如果不包含，就将本次的景点s添加进key，并给value赋值1
                map.put(s, 1);
            }
        }
        System.out.println(map);
    }
}
