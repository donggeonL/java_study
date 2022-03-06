package com.baekjoon.date0306;

import java.util.Scanner;

// 프로그래머스 문제
// https://programmers.co.kr/learn/courses/30/lessons/12943
// 콜라츠 추측

public class pro_6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int answer = 0;
        int a = num.nextInt();

        while (a != 1) {
            if (a % 2 == 0) {
                a /= 2;
            } else if (a%2 == 1) { // else 문을쓰니 오답이 나오는데 ..
                a = (3*a) + 1;     // 오버플로우되는 경우가 생길 수 있을 것 같다고함!
            }

            answer++;
            if (answer > 500) {
                answer = -1;
                break;
            }
        }
        System.out.println(answer);
    }
}
