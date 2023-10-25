package com.sikku;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer i = Integer.MAX_VALUE;
        Integer j = 12;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(i>>1);
        System.out.println(System.identityHashCode(i));
        System.out.println(j.hashCode());

        int[] ar = {1,2};
        int x = Arrays.binarySearch(ar,2);



//        int i =4;
//        int j =5;
//        i = i^j;
//        j = i^j;
//        i = i^j;
//        System.out.println("i "+i+"\nj "+j);
    }
}
