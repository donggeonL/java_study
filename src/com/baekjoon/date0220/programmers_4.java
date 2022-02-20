package com.baekjoon.date0220;

import java.util.Scanner;

// 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
// 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
// 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
public class programmers_4 {
    public static void main(String[] args) {
        boolean answer = true;

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        sc.close();

        int sum=0;
        int n = x;

        while(x!=0){
            sum += x%10;
            x/= 10;
        }

        if( n % sum == 0){
            System.out.println(answer);
        }
        else
            System.out.println(false);
    }
}
