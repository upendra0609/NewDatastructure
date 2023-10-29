package com.sikku;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CharByFrequency {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }

    public static String frequencySort(String s) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());


        // Sort the List by values using a lambda expression
        entryList.sort((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()));


        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> j : entryList) {
            int x = j.getValue();
            while (x > 0) {
                result.insert(0, j.getKey());
                x--;
            }
        }

        return result.toString();
    }


}
