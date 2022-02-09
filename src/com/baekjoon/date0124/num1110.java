package com.baekjoon.date0124;

import java.util.Scanner;

public class num1110 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int n = num.nextInt();
        num.close();

        int cnt = 0;
        int same_number = n;

        while(true){
            n = ((n%10)*10) + (((n/10) + (n%10)) %10);
            cnt++;

            if(same_number == n){
                break;
            }
        }
        System.out.println(cnt);
    }
}
