package com.baekjoon.date0518;

import java.util.Scanner;

public class samsungsw_d1_1 {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();

            int[] arr = new int[10];
            int sum = 0;

            for(int test_case = 1; test_case <= T; test_case++)
            {
                for (int i = 0; i < 10; i++) {
                    arr[i] = sc.nextInt();
                }

                for (int i = 0; i < 10; i++) {
                    if (arr[i] % 2 == 1) {
                        sum += arr[i];
                    }
                }

                System.out.println("#" + test_case + " " + sum);
                sum = 0;
            }
        }
    }
}
