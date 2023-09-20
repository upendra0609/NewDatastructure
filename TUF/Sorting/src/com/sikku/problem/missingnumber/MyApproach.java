package com.sikku.problem.missingnumber;

public class MyApproach {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 0};
        System.out.println(missingNum(array));
    }

    //elements mus be in ascending sorting order
    public static int missingNum(int[] array) {
        int missing = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != missing) {
                return missing;
            }
            missing++;
        }
        return 0;

    }
}
