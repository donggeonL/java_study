package com.baekjoon.date0212;

import java.util.Scanner;

// 최대값
public class num2562 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int[] arr = {num.nextInt(),num.nextInt(),num.nextInt(),
                num.nextInt(),num.nextInt(),num.nextInt(),
                num.nextInt(),num.nextInt(),num.nextInt()};
        num.close();

        int count = 0;
        int max= 0;
        int index = 0;

        for(int value : arr){
            count++;

            if(value > max){
                max = value;
                index = count;
            }
        }

        System.out.println(max + "\n" + index);
    }
}
