package com.baekjoon.date0306;
//https://programmers.co.kr/learn/courses/30/lessons/12940
//프로그래머스 코딩테스트 연습
// 최소공배수 최대공약수

import java.util.Scanner;

public class pro_7 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int[] answer = new int[2];
        int n = num.nextInt(); // 최소공배수
        int m = num.nextInt(); // 최대공약수

        int a = Math.max(n, m); // 큰 수 구하기
        int b = Math.min(n, m); // 작은 수 구하기

        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        answer[0] = a;
        answer[1] = n * m / a;

        System.out.println(answer[0] + " " + answer[1]);
    }
}
