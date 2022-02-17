package com.baekjoon.date0216;

import java.util.Scanner;

// x만큼 간격이 있는 n개의 숫자
public class programmers_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int[] arr = new int[b];
        int sum = 0;

        for(int i = 0; i < b; i++){
            sum = sum + a;
            arr[i] = sum;
            System.out.println(arr[i]);
        }
    }
}
