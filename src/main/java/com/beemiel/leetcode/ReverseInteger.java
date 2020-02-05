/*
날짜 모르겠음
리트코드 정수 뒤집기
https://leetcode.com/problems/reverse-integer/
 */

package com.beemiel.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(456));
    }

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
