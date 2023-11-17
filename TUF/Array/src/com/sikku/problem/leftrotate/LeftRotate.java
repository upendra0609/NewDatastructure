package com.sikku.problem.leftrotate;

public class LeftRotate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
//        rotateArray(array, array.length, 6);
        rotateArrayOptimal(array, array.length, 1);
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    public static void leftRotateByOne(int[] array, int size) {
        int temp = array[0];
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = temp;
    }

    //brute solution
    public static void rotateArray(int[] array, int size, int rotateBy) {
        rotateBy %= size;
        int[] tempArray = new int[rotateBy];

        for (int i = 0; i < rotateBy; i++) {
            tempArray[i] = array[i];
        }

        for (int i = rotateBy; i < size; i++) {
            array[i - rotateBy] = array[i];
        }

        for (int i = 0; i < tempArray.length; i++) {
            array[size - rotateBy + i] = tempArray[i];
        }
    }

    //    optimal solution
    public static void rotateArrayOptimal(int[] array, int size, int rotateBy) {
        rotateBy %= size;
        reverseArray(array, 0, rotateBy-1);
        reverseArray(array, rotateBy, size-1);
        reverseArray(array, 0, size-1);
    }

    public static void reverseArray(int[] array, int low, int high) {
        while (low<high){
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }
    }
}
