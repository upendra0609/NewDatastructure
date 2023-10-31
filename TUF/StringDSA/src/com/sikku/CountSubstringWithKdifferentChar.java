package com.sikku;

import java.util.HashSet;

public class CountSubstringWithKdifferentChar {
    public static void main(String[] args) {
        System.out.println(countSubStrings("aaaaa"));
    }

    public static String countSubStrings(String str) {
        int n = str.length();
        int[][] tempArray = new int[n][n];
        int maxLength = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                if (i == j) {
//                    tempArray[i][j] = 1;
//                }
                if (i == j || (i == (j - 1) && str.charAt(i) == str.charAt(j))) {
                    if (j - i + 1 > maxLength) {
                        start = i;
                        end = j;
                        maxLength = j - i + 1;
                    }
                    tempArray[i][j] = 1;
                }
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = i + 2; j < n; j++) {
                if (str.charAt(i) == str.charAt(j) && tempArray[i + 1][j - 1] == 1) {
                    if (j - i + 1 > maxLength) {
                        start = i;
                        end = j;
                        maxLength = j - i + 1;
                    }
                    tempArray[i][j] = 1;
                }
            }
        }

        for (int[] i: tempArray){
            for (int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        return str.substring(start, end + 1);
    }
}
