package org.example.problems;

import java.util.Arrays;

public class InsertionSortArrayProblem {

    public static void main(String[] args) {
        int [] arr = {5, 3, -3, 0, 4, 6, 2};
        int [] res = insertionSort(arr);

        System.out.println("resultado:");
        Arrays.stream(res).forEach(System.out::print);
        System.out.println("");
        Arrays.sort(arr);
        System.out.println("esperado: ");
        Arrays.stream(res).forEach(System.out::print);

        System.out.println("Segunda vez: ");
        int [] res2 = insertionSort2(arr);
        Arrays.stream(res2).forEach(System.out::print);

    }

    static int[] insertionSort(int[] arr) {

        // i=1 j= 0 int [] arr = {3, 5, -3, 0, 4, 6, 2};

        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i - 1;
            while (j >=0 && val < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = val;
        }
        return arr;
    }

    static int[] insertionSort2(int[] arr) {

        //{3, 5, -3, 0, 4, 6, 2};
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j > 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
      return arr;
    }
}
