package com.baekjoon.date0124;

import java.util.Scanner;

public class num10951 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        while (true) {
            int a = num.nextInt();
            int b = num.nextInt();

            if(a==0 && b==0){
                num.close();
                break;
            }
            System.out.println(a+b);
        }
    }
}
