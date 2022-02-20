package com.baekjoon.date0220;

import java.util.Scanner;

// 입력받은 숫자 갯수 만큼 평균구하기
public class programmers_5 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int a = num.nextInt();
        int[] arr = new int[a];
        int sum=0;

        double answer = 0;

        for(int i = 0; i<a; i++){
            arr[i] = num.nextInt();
        }

        for(int i = 0; i<a; i++){
            sum += arr[i];
        }

        System.out.println(sum);
        answer = (double) sum/arr.length;


        System.out.println(answer);

        num.close();
    }
}
