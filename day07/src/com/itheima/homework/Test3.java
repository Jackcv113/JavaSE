package com.itheima.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/*
    08、分析以下需求并完成代码
        现有字符串信息如下，请将字符串中的书名提取为Map集合的键，将作者提取为Map集合的值
        并使用三种不同方式，遍历Map集合打印键值对元素内容
            {"《红楼梦》-曹雪芹","《西游记》-吴承恩","《三国演义》-罗贯中","《水浒传》-施耐庵"}
*/
public class Test3 {
    public static void main(String[] args) {
        String[] str = {"《红楼梦》-曹雪芹","《西游记》-吴承恩","《三国演义》-罗贯中","《水浒传》-施耐庵"};
        HashMap<String, String> map = new HashMap<>();
        for (String s : str) {
            String[] sp = s.split("-");
            map.put(sp[0],sp[1]);
        }
        //遍历
        //方法一：
        Set<String> key = map.keySet();
        for (String s : key) {
            String editor = map.get(s);
            System.out.println(s +"---"+editor);
        }
        //方法二：
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key1 = entry.getKey();
            String value = entry.getValue();
            System.out.println(key1 +"---"+value);
        }
        //方法三：
        map.forEach((s, s2) -> System.out.println(s +"---"+s2));
    }
}
