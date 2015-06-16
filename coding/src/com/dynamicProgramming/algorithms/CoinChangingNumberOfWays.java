package com.dynamicProgramming.algorithms;


import java.util.Arrays;

public class CoinChangingNumberOfWays {

    int total = 5;
    int coins[] = {1,2,3};
    public static int[][] arr;

    CoinChangingNumberOfWays(){
        arr = new int[coins.length][total + 1];
        for(int i=0;i<coins.length;i++){
            for(int j=0;j<total + 1;j++){
                arr[i][j] = 0;
            }
        }

        findNumberOfWays(arr, coins.length, total, coins);
    }

    public static void findNumberOfWays(int [][] arr, int low, int high, int[] coins){


        for(int i=0; i < low; i++){
            arr[i][0] = 1;
        }

        for(int i=0;i<=high;i++){
            arr[0][i] = 1;
        }



        for(int i=1;i<low;i++){
            for(int j=1;j<=high;j++){
                if(j>=coins[i])
                {
                    arr[i][j] = arr[i-1][j] + arr[i][j-coins[i]];

                }else{
                    arr[i][j] = arr[i-1][j];

                }
            }
        }
    }

    public static void main(String[] args){
        CoinChangingNumberOfWays cc = new CoinChangingNumberOfWays();
        System.out.println(Arrays.deepToString(arr));


    }



}
