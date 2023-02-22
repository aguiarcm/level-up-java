package org.example.problems;

import java.util.StringJoiner;

public class ReverseWordsInStringProblem {

    public static void main(String[] args) {
        String a = "the sky is blue";
        String b = "blue is sky the";
        System.out.println(b.equals(reverseWords(a)));

        String c = "a good   example";
        String d = "example good a";
        System.out.println(d.equals(reverseWords(c)));
    }

    static String reverseWords(String input) {
        String trimmed  = input.trim();
        String[] arr = trimmed.split(" ");
        StringJoiner stringJoiner = new StringJoiner(" ");

        for (int i = arr.length - 1; i >= 0 ; i--) {
            if ("".equals(arr[i])) continue;
            stringJoiner.add(arr[i]);
        }
        return stringJoiner.toString();
    }


}
