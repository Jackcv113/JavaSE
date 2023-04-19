package com.itheima.sort;

import java.util.Arrays;
//选择排序
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2};
        //外循环
        //决定循环几轮
        //每一轮确定一个位置上的元素
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环
            //用当前位置的元素和后面的每个元素做对比，将较小的元素放置当前位置
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
