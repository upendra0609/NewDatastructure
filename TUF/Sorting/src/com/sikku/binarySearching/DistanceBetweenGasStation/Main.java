package com.sikku.binarySearching.DistanceBetweenGasStation;

import java.util.Objects;
import java.util.PriorityQueue;

public class Main {

    

    public static void main(String[] args) {
        int[] array = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10};
        double x = optimal(array, 1);
        System.out.println(x);
    }

    public static double brute(int[] array, int station) {
        int n = array.length - 1;
        int[] howMany = new int[n];

        for (int i = 1; i <= station; i++) {
            double maximumValue = -1;
            int maxIndex = -1;
            for (int j = 0; j < n; j++) {
                double diff = array[j + 1] - array[j];
                double sectionLength = diff / ((double) howMany[j] + 1);
                if (maximumValue < sectionLength) {
                    maximumValue = sectionLength;
                    maxIndex = j;
                }
            }
            howMany[maxIndex]++;
        }

        double result = -1L;
        for (int i = 0; i < n; i++) {
            double diff = array[i + 1] - array[i];
            double sectionLength = diff / ((double) howMany[i] + 1);
            if (sectionLength > result) {
                result = sectionLength;
            }
        }
        return result;
    }

    public static double optimal(int[] array, int station) {
        int n = array.length - 1;
        int[] howMany = new int[n];
        PriorityQueue<Pair> queue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            double diff = array[i + 1] - array[i];
            queue.add(new Pair(diff, i));
        }


        for (int i = 1; i <= station; i++) {
            Pair p = queue.poll();
            assert p != null;
            howMany[p.index]++;
            double diff = (p.maximumLength * howMany[p.index]) / (double) (howMany[p.index] + 1);
            queue.add(new Pair(diff, p.index));
        }
        return Objects.requireNonNull(queue.poll()).maximumLength;
    }

}
