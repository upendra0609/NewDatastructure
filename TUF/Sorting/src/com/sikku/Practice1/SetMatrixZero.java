package com.sikku.Practice1;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] array = {{1, 1, 1, 1}, {1, 0, 1, 1}, {1, 1, 0, 1}, {1, 0, 0, 1}};
        setZero(array);
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void setZero(int[][] array) {
        int m = array.length;
        int n = array[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] == 0) {
                    for (int p = 0; p < n; p++) {
                        if (array[i][p] == 1) {
                            array[i][p] = -1;
                        }
                    }
                    for (int p = 0; p < m; p++) {
                        if (array[p][j] == 1) {
                            array[p][j] = -1;
                        }
                    }
                }
            }
        }

        for (int i=0; i<m;i++){
            for (int j=0; j<n;j++){
                if(array[i][j]==-1){
                    array[i][j]= 0;
                }
            }
        }
    }
}
