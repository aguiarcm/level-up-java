package org.example.problems;

import java.util.Stack;

public class ValidParenthesesProblem {



    public static void main(String[] args) {
        String s1 = "()"; // true
        String s2 = "(){}[]"; // true
        String s3 = "(]"; // false
        String s4 = "(({[]}))"; // true

        System.out.println("s1 (true)" + isValid(s1));
        System.out.println("s2 (true)" + isValid(s2));
        System.out.println("s3 (false)" + isValid(s3));
        System.out.println("s4 (true)" + isValid(s4));
    }

    static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray() ) {
            if ('(' == c || '{' == c || '[' == c) {
                stack.push(c);
                continue;
            }

            if (stack.empty()) return false;
            if (')' == c && stack.pop() != '(') return false;
            if ('}' == c && stack.pop() != '{') return false;
            if (']' == c && stack.pop() != '[') return false;
        }
            return true && stack.empty();
    }
}
