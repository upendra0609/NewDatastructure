package com.sikku;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] ar = {3,10,9,2,9,9,10};
        int n = ar.length;

        for (int i=0; i<n; i++){
            boolean duplicate = false;
            for (int j= i+1; j<n; j++){
                if(ar[i] == ar[j] && ar[j]>=0){
                    ar[j] = -1;
                    duplicate = true;
                }
            }
            if(duplicate){
                System.out.print(ar[i]+" ");
            }
        }
    }
}
