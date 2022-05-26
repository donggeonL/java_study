package com.baekjoon.date0526;

import java.util.Scanner;

public class samsungsw_d1_15 {
    public static void main(String[] args) {
        {


            Scanner sc = new Scanner(System.in);
            int T = 1;
            int[] arr = new int[2];

            for (int test_case = 1; test_case <= T; test_case++) {
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                }

                int plus = arr[0] + arr[1];
                int minus = arr[0] - arr[1];
                int multiply = arr[0] * arr[1];
                int division = arr[0] / arr[1];

                System.out.println(plus);
                System.out.println(minus);
                System.out.println(multiply);
                System.out.println(division);
            }


        }
    }
}
