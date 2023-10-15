package com.sikku.binarySearching.DistanceBetweenGasStation;

import java.util.Objects;
import java.util.PriorityQueue;

public class Main {

    static class Pair implements Comparable<Pair> {
        double maximumLength;
        int index;

        public Pair(double maximumLength, int index) {
            this.maximumLength = maximumLength;
            this.index = index;
        }

        public double getMaximumLength() {
            return maximumLength;
        }

        public void setMaximumLength(double maximumLength) {
            this.maximumLength = maximumLength;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "maximumLength=" + maximumLength +
                    ", index=" + index +
                    '}';
        }

        //decreasing order
        @Override
        public int compareTo(Pair p2) {
            if (this.maximumLength < p2.maximumLength) {
                return 1;
            } else if (this.maximumLength > p2.maximumLength) {
                return -1;
            } else {
                Integer i = this.index;
                Integer j = p2.index;
                return -i.compareTo(j);
            }
        }
    }

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

    
}
