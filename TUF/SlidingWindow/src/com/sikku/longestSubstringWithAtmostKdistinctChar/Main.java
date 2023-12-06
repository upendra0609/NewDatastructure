package com.sikku.longestSubstringWithAtmostKdistinctChar;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(kDistinctChars(6, "zcviqwyuydegijtgwxujqdn"));
    }

    public static int kDistinctChars(int k, String str) {
        int right = 0;
        int left = 0;
        int n = str.length();
        HashMap<Character, Integer> hash = new HashMap<>();
        int maxLength = 0;

        while (right < n) {
            char ch = str.charAt(right);
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);
            while (left <= right && hash.size() > k) {
                char removeChar = str.charAt(left);
                if (hash.get(removeChar) > 1) {
                    hash.put(str.charAt(left), hash.get(removeChar) - 1);
                } else {
                    hash.remove(removeChar);
                }
                left++;
            }
            if (hash.size() <= k) {
                maxLength = Math.max(maxLength, (right - left + 1));
            }
            right++;

        }
        return maxLength;
    }
}
