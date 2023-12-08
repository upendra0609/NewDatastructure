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


}
