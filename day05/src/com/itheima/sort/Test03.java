package com.itheima.sort;

//二分查找法
public class Test03 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        int search = search(arr, 66);
        System.out.println(search);
    }

    //定义方法
    //接收一个数组和查询的数字
    public static int search(int[] arr, int num) {
        //定义最大值 和 最小值
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            //定义中间值
            int mid = (min + max) / 2;
            if (arr[mid] > num) {//如果中间值大于查询的数值，重新赋值min
                max = mid - 1;
            } else if (arr[mid] < num) {//如果中间值大于查询的数值，重新赋值max
                min = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
