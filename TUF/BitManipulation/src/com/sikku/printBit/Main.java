package com.sikku.printBit;

public class Main {
    public static void main(String[] args) {
        int[] arr = bitManipulation(25, 3);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] bitManipulation(int num, int i) {
        int temp = num;
        i = i - 1;
        int setValue = (1 << i) & temp;

        if (setValue == 0) {
            temp = temp | (1 << i);
        } else {
            int mask = ~(1 << i);
            num = num & mask;
        }
        int[] ans = new int[3];
        ans[0] = setValue != 0 ? 1 : 0;
        ans[1] = temp;
        ans[2] = num;

        return ans;

    }
}
