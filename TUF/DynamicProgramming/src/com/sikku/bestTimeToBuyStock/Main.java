package com.sikku.bestTimeToBuyStock;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 9, 1, 2};
//        System.out.println(maxProfit(array));
//        betterSol(array);
        optimal(array);
    }

    public static void betterSol(int[] array) {
        int[] tempArray = new int[array.length];
        int max = Integer.MIN_VALUE;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > max) {
                max = array[i];
            }
            tempArray[i] = max;
        }
        int profit = 0;
        for (int i = 0; i < array.length; i++) {
            if ((tempArray[i] - array[i]) > profit) {
                profit = tempArray[i] - array[i];
            }
        }

        System.out.println(profit);
    }

    //optimal
    public static int maxProfit(int[] array) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                max = array[i];
            } else if (array[i] > min && array[i] > max) {
                max = array[i];
                if ((array[i] - min) > profit) {
                    profit = max - min;
                }
            }
        }
        return profit;
    }

    public static int optimal(int[] array) {
        int minSoFar = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minSoFar) {
                minSoFar = array[i];
            }
            if (array[i] - minSoFar > profit) {
                profit = array[i] - minSoFar;
            }
        }
        return profit;
    }

}
