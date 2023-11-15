package com.sikku.nonrepeatingNumber;

public class Main {
    public static void main(String[] args) {
        int[] arr = singleNumber(new int[]{1, 2, 3, 2, 1, 4});
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int i : nums) {
            xor ^= i;
        }

        int n = xor & (-xor);

//        int index = (int) (Math.log(n) / Math.log(2));

        int first = 0;
        int second = 0;
        for (int i : nums) {
            if ((i & (1 << n)) == 0) {
                first ^= i;
            } else {
                second ^= i;
            }
        }

//        int first = xor ^ remXor;
//        int second = xor ^ first;

        int[] result = new int[2];
        if (first <= second) {
            result[0] = first;
            result[1] = second;
        } else {
            result[1] = first;
            result[0] = second;
        }

        return result;
    }
}
