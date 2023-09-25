package com.sikku.problem.pascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int r = 3;
//        System.out.println(printParticularElement(n - 1, r - 1));

        printNthRow(5);
    }

    public static long printParticularElement(int n, int c) {
        long result = 1;

        for (int i = 0; i < c; i++) {
            result *= (n - i);
            result /= (i + 1);
        }

        return result;
    }

    public static void printNthRow(int n) {
        int ans = 1;
        System.out.print(ans);


        for (int i = 1; i < n; i++) {
            ans *= (n - i);
            ans /= i;
            System.out.print(" " + ans);
        }
    }

    public static List<List<Integer>> printPascal(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        int x = 1;

        while (x <= numRows) {
            int temp = 1;
            ArrayList<Integer> tempResult = new ArrayList<>();
            tempResult.add(temp);
            for (int i = 1; i < x; i++) {
                temp *= (x - i);
                temp /= i;
                tempResult.add(temp);
            }
            result.add(tempResult);
            x++;

        }
        return result;
    }
}
