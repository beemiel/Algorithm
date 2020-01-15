package com.beemiel.algorithm.level1;

import java.util.Arrays;

//수 정렬하기 3
//https://www.acmicpc.net/problem/10989
//숫자 정렬 중 퀵소트를 구현해봄
public class QuickSort {

    public static void quickSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = partition(arr, low, high);
        sort(arr, low, mid - 1);
        sort(arr, mid, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low] < pivot) low++;
            while (arr[high] > pivot) high--;
            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }
        return low;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {0,6,3,5,8,2,9,1,4,7};
        Arrays.stream(arr).forEach(System.out::print);
        System.out.println();
        QuickSort.quickSort(arr);
        Arrays.stream(arr).forEach(System.out::print);
    }

}
