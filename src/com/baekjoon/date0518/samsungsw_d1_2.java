package com.baekjoon.date0518;

import java.util.Scanner;

public class samsungsw_d1_2 {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        double sum=0;
        int[] arr = new int[10];
        double avr = 0;

        for(int test_case = 1; test_case <= T; test_case++)
        {
            for(int i = 0; i < 10; i++){
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i < 10; i++){
                sum += arr[i];
            }

            avr = sum / arr.length;

            System.out.println("#" + test_case + " " + Math.round(avr));
            avr = 0;
            sum = 0;
        }

    }
}
