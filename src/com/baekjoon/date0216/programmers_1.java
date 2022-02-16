package com.baekjoon.date0216;

import java.util.Scanner;

// 직사각형 별찍기
public class programmers_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();
        for(int i = 0; i < b ; i++){
            System.out.println();
            for(int k =0; k<a ; k++){
                System.out.print("*");
            }
        }
    }
}
