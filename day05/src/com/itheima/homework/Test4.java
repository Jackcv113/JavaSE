package com.itheima.homework;

import java.util.Arrays;

public class Test4 {
    /*
	    05、分析以下需求并完成代码
		请编写代码实现冒泡排序，将数组{55,33,44,11,22}按照升序排列（独立完成!!）
*/
    public static void main(String[] args) {
        int[] arr = {55, 33, 44, 11, 22};
        for (int i = 0; i < arr.length - 1; i++) {
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
