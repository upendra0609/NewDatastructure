package com.sikku.binarySearching.kokoEatingBanana;

public class Main {
    public static void main(String[] args) {
        int[] array = {30,11,23,4,20};
        int n = minEatingSpeed(array, 5);
        System.out.println(n);
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low =1;
        int high = max(piles);
        while(low<=high){
            int mid = (low+high)/2;
            int time = totalTime(piles, mid);
            if(time>h){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }

    public static int totalTime(int[] array, int t){
        int time = 0;
        for(int i: array){
            time += Math.ceil((double)i/t);
        }
        return time;
    }

    public static int max(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i: array){
            if(i>max){
                max = i;
            }
        }
        return max;
    }
}


