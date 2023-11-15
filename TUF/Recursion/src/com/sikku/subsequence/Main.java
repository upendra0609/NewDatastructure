package com.sikku.subsequence;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    final static HashSet<List<Integer>> result1 = new HashSet<>();
    final static HashSet<List<Character>> result = new HashSet<>();

    public static void main(String[] args) {
//        Integer[] array = {3, 2, 1};
//        subSequence(0, array, new ArrayList<>());

        subSequence(0, "cba", new ArrayList<>());
//        System.out.println(result.size());

        for (List<Character> i : result) {
            System.out.println(i);
        }
    }

    public static void subSequence(int index, Integer[] array, List<Integer> hash) {
        if (index >= array.length) {
            result1.add(new ArrayList<>(hash));
            return;
        }

        hash.add(array[index]);
        subSequence(index + 1, array, hash);
        hash.remove(array[index]);
        subSequence(index + 1, array, hash);
    }

    public static void subSequence(int index, String str, List<Character> hash) {
        if (index >= str.length()) {
            result.add(new ArrayList<>(hash));
            return;
        }

        hash.add(str.charAt(index));
        subSequence(index + 1, str, hash);
        hash.remove((Character) str.charAt(index));
        subSequence(index + 1, str, hash);
    }
}
