package com.sikku.problem.numappearonce;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,3,5,3,5,1,9};
        System.out.println(onceAppearNum(array));
    }

    public static int onceAppearNum(int[] array) {
        int maxNum = 0;
        for (int i = 0; i < array.length; i++) {
            maxNum = array[i] > maxNum ? array[i] : maxNum;
        }
        int[] tempArray = new int[maxNum + 1];

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            tempArray[temp] = tempArray[temp] +1;
        }


        for (int i=0; i<tempArray.length; i++){
            if(tempArray[i]==1){
                return i;
            }
        }
        return -1;
    }
}
