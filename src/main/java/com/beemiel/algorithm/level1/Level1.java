package com.beemiel.algorithm.level1;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Level1 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));

        System.out.println(reverse(456));
    }


    //완주하지 못한 선수
    //https://programmers.co.kr/learn/courses/30/lessons/42576
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i = 0; i < completion.length; i++){
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }else {
                answer = participant[completion.length];
            }
        }

        return answer;
    }

    //정수 뒤집기
    //https://leetcode.com/problems/reverse-integer/
    public static int reverse(int x) {
        String inputToString ="";
        String returnString = "";
        int minus = 1;

        if(x<0){
            minus = -1;
            x *= -1;
        }

        inputToString = Integer.toString(x);
        returnString = "";

        for(int stringChar=inputToString.length(); stringChar>0; stringChar--){
            returnString += inputToString.charAt(stringChar-1);
        }

        return (Integer.parseInt(returnString)*minus);
    }



}
