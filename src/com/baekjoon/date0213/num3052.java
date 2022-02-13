package com.baekjoon.date0213;

import java.util.Scanner;

// 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
public class num3052 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int[] arr = new int[10];
        int temp;
        int count = 0;
        
        // 10개 입력받아 42로 나눈 나머지를 배열에 저장
        for(int i = 0; i<10; i++){
            arr[i] = num.nextInt()%42;
        }

        for(int i =0; i<10 ; i++){
            temp = 0;
            for(int j = i+1; j<10; j++){
                if(arr[i] == arr[j]){
                    temp++;

                }
            }
// test 코드
//            System.out.println(temp);
            if( temp == 0){
                count++;
            }


        }

        System.out.println(count);
    }
}
