package com.baekjoon.date0524;

import java.util.Scanner;

public class samsungsw_d1_6 {
    public static void main(String[] args) {
        {


            Scanner sc = new Scanner(System.in);
            int T = 1;
            int S = sc.nextInt();
            int num = 0;

            for (int test_case = 1; test_case <= T; test_case++) {

                while(S>0){
                    num += S%10;
                    S /= 10;
                }

                System.out.println(num);

            }


        }
    }
}
