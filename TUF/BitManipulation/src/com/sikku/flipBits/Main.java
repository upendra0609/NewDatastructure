package com.sikku.flipBits;

public class Main {
    public static void main(String[] args) {
//        int[] array = {0, 0, 0, 0, 1, 0, 0};
//        System.out.println(flipBits(array.length, array));

        System.out.println(Integer.toBinaryString(100000));
    }

    public static int flipBits(int n, int[] array) {
        int count = 0;
        int max = 0;
        int start = -1;
        int last = -1;
        int tempStart = -1;
        for (int i = 0; i < n; i++) {
            if (count <= 0) {
                count = 0;
                tempStart = i;
            }

            if (array[i] == 0) {
                count++;
            } else if (count > 0 && array[i] == 1) {
                count--;
            }

            if (max < count) {
                max = count;
                start = tempStart;
                last = i;
            }
        }

        System.out.println(start + " " + last);

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i >= start && i <= last) {
                if (array[i] == 0) {
                    array[i] = 1;
                }else {
                    array[i] = 0;
                }
            }
            if (array[i] == 1) ans++;
        }
        return ans;
    }
}
