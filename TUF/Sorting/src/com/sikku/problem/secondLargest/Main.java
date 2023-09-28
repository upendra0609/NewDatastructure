package com.sikku.problem.secondLargest;

public class Main {
    public static void main(String[] args) {

        int[] array = {8,7,5,4,6,76,745,2,24,76};

        System.out.println(secondLargest(array));
    }

    public static int secondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int j : array) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (j > secondLargest && j < largest) {
                secondLargest = j;
            }
        }

        return secondLargest;
    }
}
