/*
200207
프로그래머스 모의고사
https://programmers.co.kr/learn/courses/30/lessons/42840
 */

package com.beemiel.programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class MockTest {
    public static void main(String[] args) {
        int[] answer;

//        int[] answers ={1,2,3,4,5};
        int[] answers ={1,3,2,4,2};

        int[] firstOMR = {1,2,3,4,5,1,2,3,4,5};
        int[] secondOMR = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] thirdOMR = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int first, second, third;

        first = match(firstOMR, answers);
        second = match(secondOMR, answers);
        third = match(thirdOMR, answers);

        ArrayList<Integer> a = rank(first,second,third);
        answer = toArray(a);

        Arrays.stream(answer).forEach(System.out::println);


    }

    public static int match(int[] omr, int[] answers){
        int index = 0;
        int count = 0;
        for(int i=0; i<answers.length; i++){
            if(answers[i]==omr[index]){
                count++;
            }
            index++;
            if(index==omr.length){
                index=0;
            }
        }

        return count;
    }

    public static ArrayList<Integer> rank(int first, int second, int third){
        ArrayList<Integer> ans = new ArrayList<>();
        int compareA = Math.max(first, second);
        int compareB = Math.max(second, third);
        int high = Math.max(compareA, compareB);

        if(first==high){
            ans.add(1);
        }
        if(second==high){
            ans.add(2);
        }if(third==high){
            ans.add(3);
        }

        return ans;
    }

    public static int[] toArray(ArrayList<Integer> a){
        int[] aa = new int[a.size()];
        for(int i=0; i<a.size(); i++){
            aa[i] = a.get(i);
        }
        return aa;
    }
}
