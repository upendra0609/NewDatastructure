package com.sikku;

public class MaximumLengthPalindrome {
    public static void main(String[] args) {
//        System.out.println(palindromeString("ababc"));
//        System.out.println(palindromeString("aaaaaa"));
        System.out.println(palindromeString("cbbd"));
    }

    public static String palindromeString(String str) {
        int n = str.length();
        if (n <= 1) return str;

        int maxLength = 1;
        int low = 0;
        int high = 0;

        for (int i = 0; i < n; i++) {
            int l = i;
            int r = i;
            while (l >= 0 && r < n && str.charAt(l) == str.charAt(r)) {
                l--;
                r++;
            }
            int len = r - l - 1;
            if (maxLength < len) {
                maxLength = len;
                low = l + 1;
                high = r - 1;
            }
        }

        for (int i = 0; i < n; i++) {
            int l = i;
            int r = i + 1;
            while (l >= 0 && r < n && str.charAt(l) == str.charAt(r)) {
                l--;
                r++;
            }
            int len = r - l - 1;
            if (maxLength < len) {
                maxLength = len;
                low = l + 1;
                high = r - 1;
            }
        }
        return str.substring(low, high + 1);
    }




    //  OR

    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        String maxStr = s.substring(0, 1);

        for (int i = 0; i < s.length() - 1; i++) {
            String odd = expandFromCenter(s, i, i);
            String even = expandFromCenter(s, i, i + 1);

            if (odd.length() > maxStr.length()) {
                maxStr = odd;
            }
            if (even.length() > maxStr.length()) {
                maxStr = even;
            }
        }

        return maxStr;
    }

    private String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
