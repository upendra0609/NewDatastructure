package com.sikku.longestSubStringWithoutRepeating;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstring("bbbb"));
        System.out.println(lengthOfLongestSubstringBetter("abcabcbb"));
        System.out.println(lengthOfLongestSubstringOptimal("abba"));
    }

    //fail in some case
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        String tempStr = "";

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (tempStr.contains(Character.toString(ch))) {
                tempStr = Character.toString(ch);
            } else {
                tempStr += ch;
            }
            maxLength = Math.max(maxLength, tempStr.length());
        }

        return maxLength;
    }

    public static int lengthOfLongestSubstringBetter(String s) {
        int n = s.length();
        int maxLength = 0;
        int right = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();

        while (right < n) {
            char ch = s.charAt(right);
            if (set.contains(ch)) {
                while (s.charAt(left) != ch) {
                    left++;
                }
                left++;
            } else {
                set.add(ch);
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }


        return maxLength;
    }


    public static int lengthOfLongestSubstringOptimal(String s) {
        int n = s.length();
        int maxLength = 0;
        int right = 0;
        int left = 0;
        HashMap<Character, Integer> hash = new HashMap<>();

        while (right < n) {
            char ch = s.charAt(right);
            if (hash.containsKey(ch)) {
                left = Math.max(hash.get(ch) + 1, left);
                hash.put(ch, right);
            } else {
                hash.put(ch, right);
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }
        return maxLength;
    }
}
