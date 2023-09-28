package com.sikku.problem.secondLargest;

public class Main {
    public static void main(String[] args) {
        int[] array = {8,7,5,4,6,76,745,2,24,76};

        System.out.println(secondLargest(array));
    }

    public static int secondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(array[i]>largest){
                secondLargest = largest;
                largest = array[i];
            }else if(array[i]>secondLargest && array[i]<largest){
                secondLargest = array[i];
            }
        }

        return secondLargest;
    }
}
