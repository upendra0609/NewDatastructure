package com.sikku.stack;


public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        myStack(array, array.length);
    }

    public static void myStack(int[] array, int size) {
        int pointer = -1;
        add(array, ++pointer, 3);
        add(array, ++pointer, 5);
        add(array, ++pointer, -1);
        System.out.println(greaterMax(array, pointer));
        add(array, ++pointer, 10);
        System.out.println(greaterMax(array, pointer));
        --pointer;
        System.out.println(greaterMax(array, pointer));
        --pointer;
        --pointer;
        add(array, ++pointer, 1);
        System.out.println(greaterMax(array, pointer));
        System.out.println(size(array, pointer));

    }

    public static void add(int[] array, int pointer, int num) {
        if (pointer < array.length) {
            array[pointer] = num;
        }
    }

    public static int greaterMax(int[] array, int pointer) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= pointer; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int size(int[] array, int pointer) {
        return pointer + 1;
    }
}
