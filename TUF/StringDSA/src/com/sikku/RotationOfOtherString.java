package com.sikku;

public class RotationOfOtherString {
    public static void main(String[] args) {
        System.out.println(brute("abcde","cdeab"));
        System.out.println(brute("abcde","abced"));
    }

    public static boolean brute(String s, String goal) {
        if (s.length() != goal.length()) return false;

        int n = s.length();
        for (int i = 0; i < n; i++) {
            StringBuilder newStr = new StringBuilder(s.substring(i,n)+ s.substring(0,i));
            if(goal.contentEquals(newStr)){
                return true;
            }
        }
        return false;
    }

    public static boolean optimal(String s, String goal){
        return true;
    }
}
