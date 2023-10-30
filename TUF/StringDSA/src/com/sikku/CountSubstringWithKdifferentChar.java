package com.sikku;

import java.util.HashSet;

public class CountSubstringWithKdifferentChar {
    public static void main(String[] args) {
        System.out.println(countSubStrings("abcad", 2));
    }

    public static int countSubStrings(String str, int k) {
        int n = str.length();
        int result = 0;

        for (int i = 0; i < n; i++) {
            HashSet<Character> hash = new HashSet<>();
            for (int j = i; j < n; j++) {
                char ch = str.charAt(j);
                hash.add(ch);
                if (hash.size() == k) {
                    result++;
                }
            }
        }
        return result;
    }
}
