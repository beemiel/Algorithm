package com.beemiel.algorithm.level1;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class January15 {

    //K번째수
    //https://programmers.co.kr/learn/courses/30/lessons/42748
    public int[] k(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] command = commands[i];

            //자른 배열
            int[] newArray = Arrays.copyOfRange(array, command[0]-1, command[1]);

            //정렬
            Arrays.sort(newArray);

            //K번째 수
            int index = command[2]-1;
            answer[i] = newArray[index];

        }

        return answer;
    }

}
