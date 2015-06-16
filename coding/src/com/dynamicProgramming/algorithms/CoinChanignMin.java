package com.dynamicProgramming.algorithms;


import java.util.Arrays;

public class CoinChanignMin {

    public static int arr[] = {1,5,6,8};
    public int total = 11;
    public int matrix[][];

    CoinChanignMin(){
        matrix = new int[arr.length][total+1];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=total;j++){
                matrix[i][j] = 0;
            }
        }

        for(int i=0;i<=total;i++){
            matrix[0][i] = i;
        }

       System.out.println( findMinimumCoinChangin(matrix, arr, total, arr.length));

    }

    public static int findMinimumCoinChangin(int [][] matrix, int [] arr, int total, int length){
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<=total;j++){
                System.out.println(Arrays.deepToString(matrix));
                if(j>=arr[i]){
                    int min = Math.min(matrix[i][j-arr[i]] + 1,  matrix[i-1][j]);
                    matrix[i][j] = min;
                }else{
                    matrix[i][j] = matrix[i-1][j];
                }
            }
        }
        return 1;
    }

    public static void main(String[] args){
        CoinChanignMin cc =new CoinChanignMin();
    }
}
