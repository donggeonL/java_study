package com.baekjoon.date0518;

import java.util.Scanner;

public class samsungsw_d1_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        int[] arr = new int[2];


        for (int test_case = 1; test_case <= T; test_case++) {
            for (int i = 0; i < 2; i++) {
                arr[i] = sc.nextInt();
            }

            if (arr[0] == arr[1]) {
                System.out.printf("#%d =\n", test_case);
            }
            else if (arr[0] < arr[1]) {
                System.out.printf("#%d <\n", test_case);
            }
            else{
                System.out.printf("#%d >\n", test_case);
            }
        }

    }
}
