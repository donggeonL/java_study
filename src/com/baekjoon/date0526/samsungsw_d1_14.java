package com.baekjoon.date0526;

import java.util.Scanner;

public class samsungsw_d1_14 {
    public static void main(String[] args) {
        {


            Scanner sc = new Scanner(System.in);
            int T = 1;
            int num = sc.nextInt();
            int[] arr = new int[num];
            int sum = 0;

            for (int test_case = 1; test_case <= T; test_case++) {

                for(int i = 0; i<arr.length; i++){
                    arr[i] = num - (i);
                    sum += arr[i];
                }
                System.out.println(sum);
            }


        }
    }
}
