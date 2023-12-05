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

    public int maxScoreBetter(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int max = 0;
        int sum =0;
        for(int i=0; i<n; i++){
            sum += cardPoints[i];
        }

        int right =0;
        int left =0;
        int smallSum =0;

        while(right<n-k){
            smallSum +=cardPoints[right];
            right++;
        }
        max = Math.max(max, sum - smallSum);

        while(right<n){
            smallSum +=  cardPoints[right];
            smallSum -=  cardPoints[left];
            max = Math.max(max, sum - smallSum);
            left++;
            right++;
        }
        return max;
    }
}
