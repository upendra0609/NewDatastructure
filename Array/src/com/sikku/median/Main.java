package com.sikku.median;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {12};
        int[] array2 = {6, 6, 7, 7};

        int i = 0;
        int j = i;
        int size = array1.length + array2.length;
        int count = (array1.length + array2.length) / 2;
        count++;


        int x = 0, y = 0;

        while (x < array1.length && y < array2.length && count > 0) {
            j = i;
            if (array1[x] <= array2[y]) {
                i = array1[x];
                x++;
            } else {
                i = array2[y];
                y++;
            }
            count--;
            if (count == 0) {
//                System.out.println(j + "  " + i);
                break;
            }
        }

        while (x < array1.length && count > 0) {
            j = i;
            i = array1[x];
            count--;
            x++;
        }

        while (y < array2.length && count > 0) {
            j = i;
            i = array2[y];
            count--;
            y++;
        }

        int result = size % 2 == 0 ? (i + j) / 2 : i;
        System.out.println(result);

    }
}
