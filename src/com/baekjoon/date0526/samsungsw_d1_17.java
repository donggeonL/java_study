package com.baekjoon.date0526;

import java.util.Scanner;

public class samsungsw_d1_17 {
    public static void main(String[] args) {
        {


            Scanner sc = new Scanner(System.in);
            int T = 1;
            int[] arr = new int[2];

            for (int test_case = 1; test_case <= T; test_case++) {
                for(int i = 0 ; i<arr.length; i++){
                    arr[i] = sc.nextInt();
                }

                if(arr[0] > arr[1]){
                    System.out.println("A");
                }else
                    System.out.println("B");
            }


        }
    }
}
