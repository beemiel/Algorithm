/*
날짜 모르겠음
프로그래머스 완주하지 못한 선수
https://programmers.co.kr/learn/courses/30/lessons/42576
 */

package com.beemiel.programmers;

import java.util.Arrays;

public class NotPerpectPlayer {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            } else {
                answer = participant[completion.length];
            }
        }

        return answer;
    }

}
