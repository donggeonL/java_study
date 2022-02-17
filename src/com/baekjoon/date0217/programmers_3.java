package com.baekjoon.date0217;

import java.util.Scanner;

// 휴대폰 전화번호 뒷자리만 공개
public class programmers_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String answer = "";

        for(int i = 0; i < a.length(); i++){
            if(i < a.length()-4){
                answer += "*";
            }
            else
                answer+=a.charAt(i);
        }
        System.out.println(answer);
    }
}
