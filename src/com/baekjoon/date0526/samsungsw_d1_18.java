package com.baekjoon.date0526;

import java.util.Scanner;

public class samsungsw_d1_18 {
    public static void main(String[] args) {
        {


            Scanner sc = new Scanner(System.in);
            int T = 1;
            int num = sc.nextInt();

            for (int test_case = 1; test_case <= T; test_case++) {
                int sum = 1;
                for (int i = 1; i <= num+1; i++) {

                    if (i == 1) {
                        System.out.printf("%d ", i);
                    } else if (i > 1) {
                        sum *= 2;
                        System.out.printf("%d ", sum);
                    }
                }
            }


        }
    }
}
