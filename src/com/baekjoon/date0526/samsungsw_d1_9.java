package com.baekjoon.date0526;

import java.util.Locale;
import java.util.Scanner;

public class samsungsw_d1_9 {
    public static void main(String[] args) {
        {


            Scanner sc = new Scanner(System.in);
            int T = 1;


            for (int test_case = 1; test_case <= T; test_case++) {
                String s = sc.next();

                for(int i = 0; i<s.length(); i++){
                    int num = (int)s.charAt(i);
                    System.out.printf("%d ", num-64);
                }


            }


        }
    }
}
