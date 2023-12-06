package com.sikku.minimumWindowSubstring;

public class Main {
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
        System.out.println("2 "+ minWindow("A", "AA"));
//        StringBuilder s = new StringBuilder("baa");
//        System.out.println(s.indexOf("a"));
    }

    public static String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        int right = 0;


        StringBuilder sbr = new StringBuilder();
        String result = s + t;

        while (right < m) {
            char ch = s.charAt(right);
            sbr.append(ch);
            while (contain(sbr, t)) {
                if (sbr.length() <= result.length()) {
                    result = sbr.toString();
                }
                sbr.deleteCharAt(0);
            }
            right++;
        }
        if (result.length() == s.length() + t.length()) {
            result = "";
        }
        return result;
    }

    public static boolean contain(StringBuilder tempSbr, String t) {
        StringBuilder sbr = new StringBuilder(tempSbr);
        int n = t.length();
        for (int i = 0; i < n; i++) {
            char tempCh = t.charAt(i);
            if (!sbr.toString().contains(Character.toString(tempCh))) {
                return false;
            } else {
                int index = sbr.indexOf(String.valueOf(tempCh));
                sbr.deleteCharAt(index);
            }
        }
        return true;
    }
}
