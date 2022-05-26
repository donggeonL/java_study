package com.baekjoon.date0526;

import java.util.Scanner;

public class samsungsw_d1_19 {
    public static void main(String[] args) {
        {


            Scanner sc = new Scanner(System.in);
            int T = 1;
            int a = sc.nextInt();
            int[] arr = new int[a+1];

            for (int test_case = 1; test_case <= T; test_case++) {
                for(int i = 0; i<arr.length; i++){
                    arr[i] = a-i;
                }

                for(int i = 0; i<arr.length; i++){
                    System.out.printf("%d ", arr[i]);
                }
            }


        }
    }
}
