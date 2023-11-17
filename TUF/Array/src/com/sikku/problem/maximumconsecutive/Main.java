package com.sikku.problem.maximumconsecutive;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 1, 1, 1};
        System.out.println(maxCon(array));
    }

    public static int maxConsecutive(int[] array) {
        if (array.length == 1 && array[0] == 1) {
            return 1;
        }
        int preCount = 1;
        int count = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                preCount++;
            }
            if (preCount > count) {
                count = preCount;
                preCount = 1;
            }
        }
        return count;
    }

    public static int maxCon(int[] array) {
        int max = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
                max = count > max ? count : max;
            }else {
                count =0;
            }
        }
        return max;
    }
}
