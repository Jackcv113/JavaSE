package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<Movie> c = new ArrayList<>();
        c.add(new Movie("肖生客的救赎",9.7,"罗大佑"));
        c.add(new Movie("霸王别姬",9.3,"张国荣"));
        c.add(new Movie("阿甘正传",9.1,"汤姆哥"));

        //方式一：
        for (Movie movie : c) {
            System.out.println(movie);
        }

        //方式二：
        Iterator<Movie> iterator = c.iterator();
        while (iterator.hasNext()){
            Movie next = iterator.next();
            System.out.println(next);
        }
        //方式三：
        c.forEach(System.out::println);

        ArrayList<String> list = new ArrayList<>();
        list.add("aa");

    }
}
