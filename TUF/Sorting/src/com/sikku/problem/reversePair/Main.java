package com.sikku.problem.reversePair;

public class Main {
    public static int result;

    public static void main(String[] args) {
        int[] array = {2,4,3,5,1};
//        System.out.println(brute(array));
        int x = optimal(array);
        System.out.println(x);

    }

    //T.C = O(n^2)
    public static int brute(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (2 * array[j] < temp) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int optimal(int[] array) {
        return sort(array, 0, array.length - 1);
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


        //for counting reverse pair
        int count = 0;
        int p = low;
        int q = mid + 1;
        int x = 0;
        while (p <= mid && q <= high) {
            if (array[p] > array[q] * 2) {
                x++;
                q++;
            } else {
                p++;
            }
            if (x > 0) {
                count += (mid - p + 1) * x;
                x = 0;
            }
        }


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

        for (int k : tempArray) {
            array[low] = k;
            low++;
        }
        return count;
    }
}
