package com.sikku.problem.rearrangeArrayElementBySign;

public class EqualPositiveAndNegative {
    public static void main(String[] args) {
        int[] array = {3, 1, -2, -5, 2, -4};
//        int[] ar = bruteSolution(array);
        int[] ar = optimalSolution(array);

        for (int i : ar) {
            System.out.print(i + " ");
        }
    }

    //T.C. ->O(2n)  S.C.->O(n)
    public static int[] bruteSolution(int[] array) {
        int[] positive = new int[array.length / 2];
        int[] negative = new int[array.length / 2];

        int j = 0;
        int k = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negative[j++] = array[i];
            } else {
                positive[k++] = array[i];
            }
        }

        j = 0;
        k = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = positive[j++];
            } else {
                array[i] = negative[k++];
            }
        }

        return array;
    }

    public static int[] optimalSolution(int[] array) {
        int[] tempArray = new int[array.length];

        int j = 0;
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                tempArray[k] = array[i];
                k +=2;
            }else {
                tempArray[j] = array[i];
                j=j+2;
            }
        }

        return tempArray;
    }
}
