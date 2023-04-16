package com.itheima.StringBuider;

public class Dome1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("[");
        int[] arr = {11, 22, 33};
        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.append(arr[arr.length - 1]).append("]");
        System.out.println(sb);

    }
}
