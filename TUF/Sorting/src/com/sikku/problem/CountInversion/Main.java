package com.sikku.problem.CountInversion;

public class Main {
    public static int result;

    public static void main(String[] args) {
        int[] array = {5, 3, 2, 4, 1};
//        System.out.println(brute(array));
        int x = optimal(array, array.length);
        System.out.println(x);

    }

    //T.C = O(n^2)
    public static int brute(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < temp) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int optimal(int[] array, int size) {
        return sort(array, 0, size - 1);
    }

    public static int sort(int[] array, int low, int high) {
        if (low >= high) {
            return 0;
        }


        int mid = (low + high) / 2;
        sort(array, low, mid);
        sort(array, mid + 1, high);
        return result += merge(array, low, mid, high);

    }

    public static int merge(int[] array, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int[] tempArray = new int[high - low + 1];
        int index = 0;
        int count = 0;

        while (i <= mid && j <= high) {
            if (array[i] <= array[j]) {
                tempArray[index] = array[i];
                i++;
            } else {
                count += mid - i + 1;
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

        for (int k : tempArray) {
            array[low] = k;
            low++;
        }
        return count;
    }
}
