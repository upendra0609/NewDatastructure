package com.sikku;

import java.util.HashMap;

public class AnagramString {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagra","nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        if (t.length() > s.length()) return false;

        HashMap<Character, Integer> hash = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
        }
        n = t.length();
        for (int i = 0; i < n; i++) {
            char ch = t.charAt(i);
            if (hash.containsKey(ch)) {
                if (hash.get(ch) <= 0) return false;
                hash.put(ch, hash.get(ch) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}
