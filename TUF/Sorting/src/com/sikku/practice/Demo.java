package com.sikku.practice;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(4);
        list.sort((i1,i2)-> 1);
        System.out.println(list);
    }
}
