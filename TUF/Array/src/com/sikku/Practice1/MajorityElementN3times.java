package com.sikku.Practice1;

public class MajorityElementN3times {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 3, 3, 2, 2, 2};
        majority(array);
    }

    public static void majority(int[] array) {
        int n = array.length;
        int num1 = Integer.MIN_VALUE;
        int count1 = 0;
        int num2 = Integer.MIN_VALUE;
        int count2 = 0;

        for (int i = 0; i < n; i++) {

            if (array[i] != num1 && array[i] != num2 && count1 == 0) {
                num1 = array[i];
                count1 = 1;
            } else if (array[i] != num1 && array[i] != num2 && count2 == 0) {
                num2 = array[i];
                count2 = 1;
            } else if (array[i] == num1) {
                count1++;
            } else if (array[i] == num2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == num1) {
                count1++;
            } else if (array[i] == num2) {
                count2++;
            }
        }
        if (count1 > n / 3) {
            System.out.println(num1);
        }
        if (count2 > n / 3) {
            System.out.println(num2);
        }
    }
}
