package org.example.problems;

import java.util.Arrays;

public class Median2ArraysProblem {
    public static void main(String[] args) {
        int [] num1 = {1,3};
        int [] num2 = {2};

        int[] result1 = merge(num1, num2); // result after merge [1,2,3]

        System.out.println(median(result1));

        int [] num3 = {1,2};
        int [] num4 = {3,4};
        int[] result3 = merge(num3, num4); // result after merge [1,2,3,4]
        System.out.println(median(result3));

        int [] num5 = {1,2,3,4};
        int [] num6 = {4,5,6};
        int[] result5 = merge(num5, num6); // result after merge [1,2,3,4,5,6]
        System.out.println(median(result5));
    }

    private static double median(int[] result3) {
        int length = result3.length;
        double median = 0;
        if (length % 2 != 0) {
            median = result3[length / 2];
        } else {
            median = (double)(result3[length/2] + result3[(length/2) - 1]) / 2;
        }
        return median;
    }

    static void printArray(int[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static int[] merge(int[] num3, int[] num4) {
        int[] temp = new int[num3.length + num4.length];
        for (int i = 0; i < num3.length; i++) {
            temp[i] = num3[i];
        }
        for (int i = 0; i < num4.length; i++) {
            temp[num3.length + i] = num4[i];
        }

        // remove duplicates
        int[] noSorted = removeDuplicates(temp);


        // Sorted
        sort(noSorted);
        return noSorted;
    }

    private static void sort(int[] noSorted) {

        for (int i = 1; i < noSorted.length; i++) {
            int j = i - 1;
            int temp = noSorted[i];
            while(j > 0 && temp < noSorted[j]){
                noSorted[j + 1] = noSorted[j];
                j--;
            }
            noSorted[j + 1] = temp;
        }
    }

    private static int[] removeDuplicates(int[] temp) {
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i] == temp[j]) {
                    temp[j] = -1;
                    count++;
                }
            }
        }
        int[] temp2 = new int[temp.length - count];
        int added = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > 0 ) {
                temp2[added] = temp[i];
                added++;
            }
        }
       return temp2;
    }
}
