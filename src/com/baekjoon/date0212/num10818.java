package com.baekjoon.date0212;

import java.util.Arrays;
import java.util.Scanner;

// 최대 최소
public class num10818 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int a = num.nextInt();
        int[] arr = new int[a];

        for(int i = 0; i<a; i++){
            arr[i] = num.nextInt();
        }

        num.close();
        Arrays.sort(arr);

        System.out.println(arr[0] +" "+ arr[a-1]);
    }
}
