package com.sikku;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        int[] list = {10, 10, 20, 20, 20, 30, 40, 10, 20,20};

        int pre = list[0];

        for (int i = 1; i < list.length; i++) {
            int num = list[i];
            if (num != pre) {
                System.out.print(pre + " ");
                pre = num;
            }
        }
        System.out.print(pre);
    }
}
