package com.sikku.firstsmalest;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 9, 1, 2, 5};
        firstSmallestElement(array, array.length);
    }

//    cyclic check
//    if you want to check only in forward direction then j will be upto size range

    public static void firstSmallestElement(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            int min = array[i];
            for (int j = i + 1; j < 2 * size; j++) {     //optimize this use j < i+size
                int k = j % 5;
                if (array[k] < min) {
                    min = array[k];
                    System.out.print(array[k] + " ");
                    break;
                }
            }
            if (min == array[i]) {
                System.out.print(-1 + " ");
            }
        }
    }
}
