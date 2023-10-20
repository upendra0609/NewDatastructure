package com.sikku.Practice1;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] array = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1,0,0,0,0};
        move(array);
        for (int i: array){
            System.out.print(i+" ");
        }
    }

    public static void move(int[] array) {
        int i = 0;
        while (array[i] != 0) {
            i++;
        }
        int j = i;

        for (i = j + 1; i < array.length; i++) {
            if (array[i] != 0) {
                array[j] = array[i];
                array[i] = 0;
                j++;
            }
        }
    }
}
