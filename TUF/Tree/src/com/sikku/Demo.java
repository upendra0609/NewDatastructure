package com.sikku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
//        Integer[] ar = {1, 2, 3, 4, 5};
//        Arrays.sort(ar, (I, J) -> J.compareTo(I));
//
//        String[] arr = {"1", "9", "20", "2"};
//        System.out.println(largestNum(arr));
    }

    public static String largestNum(String[] arr) {

        Arrays.sort(arr, (i1, i2) -> (i2 + i1).compareTo(i1 + i2));
        String res = "";
        for (String s : arr) {
            res += s;
        }
        return res;
    }
}
