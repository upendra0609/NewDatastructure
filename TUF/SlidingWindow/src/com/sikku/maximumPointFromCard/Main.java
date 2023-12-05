package com.sikku.maximumPointFromCard;

public class Main {
    public static void main(String[] args) {

    }

    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int last = n-k -1;
        int max =0;

        while(last < n){
            int count =0;
            int sum =0;
            int index = last + 1;
            while(count<k){
                index %=n;
                sum += cardPoints[index];
                count++;
                index++;
            }
            max = Math.max(sum,max);
            last++;
        }
        return max;
    }
}
