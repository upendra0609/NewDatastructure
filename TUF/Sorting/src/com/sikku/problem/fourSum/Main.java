package com.sikku.problem.fourSum;

public class Main {
    public static void main(String[] args) {
        int n = minOperations(new int[]{14,12,14,14,12,14,14,12,12,12,12,14,14,12,14,14,14,12,12});
        System.out.println(n);
    }

    public static int minOperations(int[] nums) {

        int x = -1;
        int y = -1;
        int z = -1;
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            x = i;
            y = -1;
            z = i + 1;
            if (nums[x] == nums[x + 1] && nums[x] != 0) {
                y = i + 1;
                if (y + 1 < nums.length) {
                    z = y + 1;
                }
            }

            while (z < nums.length && nums[x] != 0) {
                if (nums[x] == nums[z]) {
                    nums[x] = 0;
                    nums[z] = 0;
                    if (y >= 0) nums[y] = 0;
                    result++;
                    break;
                }
                z++;
            }
            if (y>0 && z>=nums.length) {
                nums[x] = 0;
                nums[y] = 0;
                result++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return -1;
            }
        }
        return result;
    }
}
