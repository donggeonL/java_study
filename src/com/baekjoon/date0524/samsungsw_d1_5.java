package com.baekjoon.date0524;

import java.util.Arrays;
import java.util.Scanner;

public class samsungsw_d1_5 {
    public static void main(String[] args) {
        {



            Scanner sc = new Scanner(System.in);
            int T=1;
            int S = sc.nextInt();
            int[] arr = new int[S+1];
            int num = 0;

            for (int test_case = 1; test_case <= T; test_case++) {

                for (int i = 0; i < S; i++) {
                    arr[i] = sc.nextInt();
                }

                Arrays.sort(arr);
                num = (S/2)+1;

                System.out.println(arr[num]);
            }



        }
    }
}
