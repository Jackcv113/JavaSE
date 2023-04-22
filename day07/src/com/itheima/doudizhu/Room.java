package com.itheima.doudizhu;

import java.util.*;

public class Room {
    ArrayList<Card> list = new ArrayList<>();

    public Room() {
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] color = {"♠", "♦", "♣", "♥"};
        String[] joker = {"👲", "🃏"};
        int size = 0;
        for (String s : number) {
            size++;
            for (String s1 : color) {
                Card c = new Card(s, s1, size);
                list.add(c);
            }
        }
        for (String j : joker) {
            list.add(new Card("", j, ++size));
        }
        System.out.println("洗牌前：" + list);
    }

    public void start() {
        //1.洗牌
        Collections.shuffle(list);
        System.out.println("洗牌后：" + list);
        //2.发牌
        //创建三个集合，为三名玩家
        ArrayList<Card> f1 = new ArrayList<>();
        ArrayList<Card> f2 = new ArrayList<>();
        ArrayList<Card> dz = new ArrayList<>();
        //创建一个集合用于存储剩下的三张底牌
        //利用sublist方法截取全部牌的后三张
        List<Card> c = list.subList(list.size() - 3, list.size());
        System.out.println("底牌为：" + c);
        //利用循环遍历
        //轮流为三个玩家集合存储发牌
        for (int i = 0; i < list.size() - 3; i++) {
            if (i % 3 == 0) {
                f1.add(list.get(i));
            } else if (i % 3 == 1) {
                f2.add(list.get(i));
            } else {
                dz.add(list.get(i));
            }
        }
        //将之前截取的三张底牌，添加给地主玩家
        dz.addAll(c);

        //排序
        //利用成员变量中的size，进行排序
        f1.sort(Comparator.comparingInt(Card::getSize));
        f2.sort(Comparator.comparingInt(Card::getSize));
        dz.sort(Comparator.comparingInt(Card::getSize));
        System.out.println("农民一号的牌" + f1);
        System.out.println("农民二号的牌" + f2);
        System.out.println("地主大哥的牌" + dz);
    }
}
