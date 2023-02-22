package org.example.problems;

public class StringReverseProblem {
    public static void main(String[] args) {
        char[] charr = {'h', 'o', 'l', 'a', 's', 'p'};
        reverse(charr);
    }

    static void reverse(char[] charS) {
        int charLen = charS.length / 2;
        System.out.println("Length: " + charLen) ;
        for (int i = 0; i < charLen; i++) {
            char temp = charS[i];
            charS[i] = charS[charS.length - i - 1];
            charS[charS.length - i - 1] = temp;
        }
        String result = new String(charS);
        System.out.println("Result: " + result) ;
    }
}
