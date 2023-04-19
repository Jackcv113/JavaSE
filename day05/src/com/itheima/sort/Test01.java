package com.itheima.sort;

import java.util.Arrays;

//冒泡法排序
public class Test01 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2};
        //外循环
        //循环 arr.length - 1 轮
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环
            //进行判断
            //将大的元素与后一位进行交换
            //每轮交换，确定后面一个索引-----------arr.length - 1 - i
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
