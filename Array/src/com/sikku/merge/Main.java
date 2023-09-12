package com.sikku.merge;

public class Main {
    public static void main(String[] args) {

        int[] ar = sortArray(new int[]{1,2,3,4,5},new int[]{4,5,6,7,8,9});

        System.out.println(ar[ar.length/2]);
        System.out.println("///////////");
        for (int i: ar){
            System.out.print(i+" ");
        }

    }

    public static int[] sortArray(int[] ar1, int[] ar2) {
        int[] mergeArray = new int[ar1.length + ar2.length];

        int i=0;
        int j=0;
        int k=0;

        while (i<ar1.length && j<ar2.length){
            if(ar1[i]<=ar2[j]){
                mergeArray[k] = ar1[i];
                i++;
            }else {
                mergeArray[k] = ar2[j];
                j++;
            }
            k++;
        }

        while (i< ar1.length){
            mergeArray[k] = ar1[i];
            k++;
            i++;
        }

        while (j< ar2.length){
            mergeArray[k] = ar2[j];
            j++;
            k++;
        }

        return mergeArray;
    }
}
