package com.baekjoon.date0526;

import java.util.Scanner;

public class samsungsw_d1_8 {
    public static void main(String[] args) {
        {


            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            int[] m_day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


            for (int test_case = 1; test_case <= T; test_case++) {
                int ymd = sc.nextInt();

                int year = ymd / 10000;
                int month = (ymd - (year * 10000)) / 100;
                int day = ymd % 100;

                if ((month < 1 || month > 12) || (day < 1 || day > m_day[month - 1]))
                    System.out.printf("#%d -1\n", test_case);
                else
                    System.out.printf("#%d %04d/%02d/%02d\n", test_case, year, month, day);
            }


        }
    }
}
