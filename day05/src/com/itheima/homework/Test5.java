package com.itheima.homework;

import java.util.Arrays;

public class Test5 {
    /*
    	06、分析以下需求并完成代码
        请编写代码实现二分查找，在数组{55,33,44,11,22}中查找33的索引（独立完成!!）
*/
    public static void main(String[] args) {
        int[] arr = {55, 33, 44, 11, 22};
        Arrays.sort(arr);
        System.out.println(search(arr, 22));
    }

    public static int search(int[] arr, int num) {
        int max = arr.length - 1;
        int min = 0;
        while (min <= max) {
            int mid = (max + min) / 2;
            if (arr[mid] > num) {
                max = mid - 1;
            } else if (arr[mid] < num) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
