package com.sikku;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class SumOfBeautyOfAllSubString {
    public static void main(String[] args) {
        System.out.println(beautySum("aabcb"));
    }

    public static int beautySum(String str) {
        int n = str.length();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int[] tempArray = new int[26];
            for (int j = i; j < n; j++) {
                int index = str.charAt(j) - 97;
                tempArray[index]++;
                sum += sum(tempArray);
            }
        }
        return sum;
    }

    public static int sum(int[] array) {
        int min = 501;
        int max = 0;

        for (int i : array) {
            if (i != 0) {
                min = Math.min(min, i);
            }
            max = Math.max(max, i);
        }

        return max - min;
    }
}

class Pair implements Comparable<Pair> {
    Character ch;
    Integer count;

    public Pair(Character ch, Integer count) {
        this.ch = ch;
        this.count = count;
    }

    public Character getCh() {
        return ch;
    }

    public void setCh(Character ch) {
        this.ch = ch;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public int compareTo(Pair o) {
        return o.count.compareTo(this.count);
    }
}
