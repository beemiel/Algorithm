/*
200205
백준 2839번 설탕 배달
https://www.acmicpc.net/problem/2839
 */

package com.beemiel.baekjun;

import java.util.Scanner;

public class SugarDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int three = 0;

        while (true) {
            if (input % 5 == 0) {
                System.out.println(input / 5 + three);
                break;
            }

            if (input < 0) {
                System.out.println(-1);
                break;
            }

            input -= 3;
            three++;
        }

    }
}
