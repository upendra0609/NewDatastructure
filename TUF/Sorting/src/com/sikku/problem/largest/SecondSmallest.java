package com.sikku.problem.largest;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 8, 43, 123, 57, 86};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i : array) {
            if (smallest > i) {
                secondSmallest = smallest;
                smallest = i;
            } else if (i < secondSmallest && i > smallest) {
                secondSmallest = i;
            }
        }
        System.out.println(smallest);
        System.out.println(secondSmallest);
    }
}
