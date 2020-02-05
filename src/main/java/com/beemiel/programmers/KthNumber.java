/*
날짜 모르겠음
프로그래머스 K번째수
https://programmers.co.kr/learn/courses/30/lessons/42748
 */

package com.beemiel.programmers;

import java.util.Arrays;

public class KthNumber {
    public int[] k(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] command = commands[i];

            //자른 배열
            int[] newArray = Arrays.copyOfRange(array, command[0] - 1, command[1]);

            //정렬
            Arrays.sort(newArray);

            //K번째 수
            int index = command[2] - 1;
            answer[i] = newArray[index];

        }

        return answer;
    }

}
