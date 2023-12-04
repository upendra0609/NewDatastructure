package com.sikku.subStringContainingAllCharacter;

public class Main {
    public static void main(String[] args) {
        System.out.println(max("acbbcac"));
        System.out.println(max("abcabc"));
    }

    public static int max(String s) {
        int n = s.length();
        StringBuilder sbr = new StringBuilder();
        int right = 0;
        int count = 0;

        while (right < n) {
            char ch = s.charAt(right);
            sbr.append(ch);
            String temp = sbr.toString();
            while (temp.contains("a") && temp.contains("b") && temp.contains("c")) {
                count += (n - right);
                sbr.deleteCharAt(0);
                temp = sbr.toString();
            }
            right++;
        }
        return count;
    }
}
