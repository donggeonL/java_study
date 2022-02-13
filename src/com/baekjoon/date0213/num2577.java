package com.baekjoon.date0213;

import java.util.Scanner;

// 숫자 갯수 구하기
public class num2577 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int arr[] = new int[10];

        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        num.close();

        int sum = a*b*c;
        while(sum > 0 ) {
            arr[sum % 10]++;
            sum /= 10;
        }

        for(int result : arr){
            System.out.println(result);
        }
    }
}
