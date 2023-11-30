package com.sikku.longestSubStringWithoutRepeating;

public class Main {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bbbb"));
    }

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
}
