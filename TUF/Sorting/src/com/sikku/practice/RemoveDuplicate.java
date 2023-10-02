package com.sikku.practice;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 2, 3, 4, 5, 5, 6};
        removeDuplicate(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void removeDuplicate(int[] array) {
        int i = 0;
        int j = 0;

        while (j < array.length) {
            int temp = array[i];
            if (temp != array[j]) {
                i++;
                array[i] = array[j];
            }
            j++;
        }
        System.out.println(i);
    }
}
