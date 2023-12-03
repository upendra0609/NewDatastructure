package com.sikku.longestRepeatingCharacterReplacement;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
    }

    public static int characterReplacement(String s, int k) {
        int right = 0;
        int left = 0;
        int maxLength = 0;
        int n = s.length();
        HashMap<Character, Integer> hash = new HashMap<>();

        while (right < n) {
            char tempCh = s.charAt(right);
            int size = (right - left) + 1;
            hash.put(tempCh, hash.getOrDefault(tempCh, 0) + 1);
            Map.Entry<Character, Integer> max = hash.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
            int highFreq = max.getValue();
            // if(!(size - highFreq <=k)){
            while (left <= right && size - highFreq > k) {
                char removeCh = s.charAt(left);
                if (hash.get(removeCh) > 1) {
                    hash.put(removeCh, hash.getOrDefault(removeCh, 0) - 1);
                } else {
                    hash.remove(removeCh);
                }
                max = hash.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
                highFreq = max.getValue();
                left++;
                size = (right - left) + 1;
            }
            // }else{
            maxLength = Math.max(right - left + 1, maxLength);
            right++;
            // }
        }
        return maxLength;
    }

    public static int characterReplacementArray(String s, int k) {
        // end - start-maxcount>k-1
        int start = 0;
        int maxcount = 0;
        int ans = 0;
        int[] c = new int[26];
        int n = s.length();
        for (int end = 0; end < n; end++) {
            int i = c[s.charAt(end) - 'A'];
            i++;
            maxcount = Math.max(maxcount, i);
            while (end - start - maxcount > k - 1) {
                c[s.charAt(start++) - 'A']--;
            }
            // System.out.println(start+" "+end+" "+maxcount);
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }
}
