package com.sikku.minimumWindowSubstring;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("a: "+minWindowOptimal("ADOBECODEBANC", "ABC"));
//        System.out.println(minWindowOptimal("A", "AA"));
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

    public static String minWindowOptimal(String s, String t) {
        if (s.contains(t)) {
            return t;
        }
        int m = s.length();
        int n = t.length();
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = t.charAt(i);
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }

        int count = hash.size();
        int right = 0;
        int left = 0;
        // int ans = Integer.MAX_VALUE;
        String ans = s;
        while (right < m) {
            char ch = s.charAt(right);
            if (hash.containsKey(ch)) {
                int tempCount = hash.get(ch);
                if (tempCount == 1) {
                    count--;
                }
                hash.put(ch, hash.getOrDefault(ch, 0) - 1);
            }
            right++;

            while (count == 0) {
//                System.out.println("right: " + right + "\nleft: " + left);
                // System.out.println(s.substring(left, right));
                String tempAns = s.substring(left, right);
                System.out.println(tempAns);
                if(ans.length()>=tempAns.length()){
                    ans = tempAns;
                }
                // ans = Math.min(ans, right - left);
                char chRemove = s.charAt(left);
                if (hash.containsKey(chRemove)) {
                    int tempCount = hash.get(chRemove);
                    if (tempCount == 0) {
                        count++;
                    }
                    hash.put(chRemove, hash.getOrDefault(chRemove, 0) + 1);
                }
                left++;
            }
        }
//        System.out.println(ans);
        if(ans.equals(s)){
            ans = "";
        }
        return ans;
    }
}
