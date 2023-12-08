package com.sikku.minimumWindowSubsequence;

public class Main {
    public static void main(String[] args) {
        System.out.println(minWindow("abcdebdde", "bde"));
        System.out.println(minWindow("dynamicprogramming", "mm"));
    }

    public static String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        int i = 0, j = 0, k = 0;
        String ans = "";

        while (i < m) {
            if (s.charAt(i) == t.charAt(k)) {
                k++;
            }
            if (k == n) {
                k--;
                j = i;
                while (k >= 0) {
                    if (s.charAt(j) == t.charAt(k)) {
                        k--;
                    }
                    j--;
                }
                k = 0;
                if (ans.length() == 0 || ans.length() > s.substring(j + 1, i + 1).length()) {
                    ans = s.substring(j + 1, i + 1);
                }
                i = j + 1;
            }
            i++;
        }
        return ans;
    }

    public static String minWindowAnother(String S, String T) {

        int s1 = 0, s2 = 0, s1Length = S.length(), s2Length = T.length();
        int start = 0, end = 0;
        int minLength = Integer.MAX_VALUE;
        String minSubstring = "";

        while (s1 < s1Length) {

            if (S.charAt(s1) == T.charAt(s2)) {
                if (s2 == s2Length - 1) {
                    end = s1;
                    while (s2 >= 0) {
                        if (S.charAt(s1) == T.charAt(s2)) {
                            s2--;
                        }
                        s1--;
                    }
                    start = s1 + 1;
                    if ((end - start + 1) < minLength) {
                        minSubstring = S.substring(start, end + 1);
                        minLength = minSubstring.length();
                    }
                    s1 = s1 + 1;
                    s2 = 0;
                } else s2++;
            }
            s1++;
        }

        return minSubstring;
    }
}
