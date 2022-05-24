package com.baekjoon.date0524;

import java.util.Arrays;
import java.util.Scanner;

public class samsungsw_d1_4 {
    public static void main(String[] args) {
        {

            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();

            int[] arr = new int[10];

            for(int test_case = 1; test_case <= T; test_case++)
            {
                int max = 0;

                for (int i = 0; i < 10; i++) {
                    arr[i] = sc.nextInt();
                }

                for (int i = 0; i < 10; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                }

                System.out.println("#" + test_case + " " + max);
            }

        }
    }
}
