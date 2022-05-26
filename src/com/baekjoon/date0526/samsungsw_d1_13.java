package com.baekjoon.date0526;

import java.util.Scanner;

public class samsungsw_d1_13 {
    public static void main(String[] args) {
        {


            Scanner sc = new Scanner(System.in);
            int T = 1;

            for (int test_case = 1; test_case <= T; test_case++) {
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (i == j) {
                            System.out.printf("#");
                        } else
                            System.out.printf("+");
                    }
                    System.out.println();
                }
            }


        }
    }
}
