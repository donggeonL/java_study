package com.baekjoon.date0526;

import java.util.Scanner;

public class samsungsw_d1_16 {
    public static void main(String[] args) {
        {


            Scanner sc = new Scanner(System.in);
            int T = 1;
            int num = sc.nextInt();

            for (int test_case = 1; test_case <= T; test_case++) {
                for(int i = 1; i<=num ; i++){
                    if(num % i == 0){
                        System.out.printf("%d ", i);
                    }
                }
            }


        }
    }
}
