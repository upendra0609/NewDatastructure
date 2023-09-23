package com.sikku.problem.longestConsecutive;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        int[] array = {9, 7, 4, 1, 2, 1, 2, 2, 2, 5, 8, 0, 12, 43, 1, 2};
        int[] array = {1, 2, 0, 1};
        System.out.println(longestConsecutive(array));

//        System.out.println(longestCons(array));

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    // T.C. -> O(nlogn + n)  giving best result
    public static int longestConsecutive(int[] array) {
//        mergeSort(array, 0, array.length - 1);
        Arrays.sort(array);
        int length = 0;
        int num = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (num + 1 == array[i]) {
                count++;
                num = array[i];
                if (length < count) {
                    length = count;
                }
            } else if (num == array[i]) {
                continue;
            } else if (num + 1 != array[i]) {
                count = 1;
                num = array[i];
            }

        }
        return length;
    }

    //high = length -1
    public static void mergeSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }

    public static void merge(int[] array, int low, int mid, int high) {
        int[] tempArray = new int[high - low + 1];
        int i = low;
        int j = mid + 1;

        int index = 0;

        while (i <= mid && j <= high) {
            if (array[i] <= array[j]) {
                tempArray[index] = array[i];
                i++;
            } else {
                tempArray[index] = array[j];
                j++;
            }
            index++;
        }

        while (i <= mid) {
            tempArray[index] = array[i];
            i++;
            index++;
        }

        while (j <= high) {
            tempArray[index] = array[j];
            j++;
            index++;
        }

        for (int ele : tempArray) {
            array[low] = ele;
            low++;
        }
    }

    //optimal solution
    public static int longestCons(int[] array) {

        HashSet<Integer> set = new HashSet<>();
        for (int i : array) {
            set.add(i);
        }

        int length = 0;
        for (int i : set) {
            int x = i;
            int count = 1;
            if (!set.contains(x - 1)) {
                while (set.contains(x + 1)) {
                    count++;
                    x++;
                }
                if (count > length) {
                    length = count;
                }
            }
        }
        return length;
    }
}
