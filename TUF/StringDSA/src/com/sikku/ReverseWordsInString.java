package com.sikku;

import java.util.ArrayList;

public class ReverseWordsInString {
    public static void main(String[] args) {

    }

    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int n = s.length();
        while (i < n) {
            while (i < n && s.charAt(i) == ' ') {
                i++;
            }
            int j = i;
            while (j < n && s.charAt(j) != ' ') {
                j++;
            }
            if (result.length() == 0) result.insert(0, s.substring(i, j));
            else if(j>i) result.insert(0, s.substring(i, j) + " ");
            i = j+1;
        }
        return result.toString();

    }
}
