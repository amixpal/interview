package com.dynamicProgramming.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class cutTheRod {

    public int matrix[][];
    int length = 4;

    cutTheRod(int size_of_rod, int [] arr){

        matrix = new int[4][size_of_rod+1];
        for(int i=0;i<4;i++){
            for(int j=0;j<=size_of_rod;j++){
                matrix[i][j] = 0;
            }
        }

        for(int i=0;i<=size_of_rod;i++){
            matrix[0][i] = i * arr[0];
            System.out.println(matrix[0][i]);
        }
        getMaximumProfit(matrix, size_of_rod,length, arr);

    }

    public void getMaximumProfit(int [][] matrix, int size_of_rod, int length, int [] arr)
    {
        for(int i=1;i<length;i++){
            for(int j=1;j<=size_of_rod;j++){
                if(j>=i){
                    matrix[i][j] = Math.max(matrix[i][j-i] + arr[i], matrix[i-1][j]);
                    System.out.println(Arrays.deepToString(matrix));
                }else{
                    matrix[i][j] = matrix[i-1][j];
                    System.out.println(Arrays.deepToString(matrix));
                }
            }
        }
    System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args){
        int arr[];
        arr = new int[4];
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of rod");
        int length = scn.nextInt();
        System.out.println("Enter the number of profit value as per index of an array");
        for(int i=0;i<4;i++){
           arr[i]  = scn.nextInt();
        }

        cutTheRod ct = new cutTheRod(length, arr);

    }
}
