package com.sikku.problem.largest;

public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 7, 7, 5,9,12,3,53,1,235};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                secondLargest = largest;
                largest = array[i];
            } else if (secondLargest < array[i] && array[i] < largest) {
                secondLargest = array[i];
            }
        }
        System.out.println(secondLargest);
        System.out.println(largest);
    }
}
