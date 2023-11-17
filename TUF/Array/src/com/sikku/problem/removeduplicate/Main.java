package com.sikku.problem.removeduplicate;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 2, 2, 2, 3, 4, 5, 5, 6, 7};
        int j = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[j] != array[i]) {
                array[j + 1] = array[i];
                j++;
            }
        }

        for (int p : array) {
            System.out.print(p + " ");
        }
    }
}
