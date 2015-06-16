package com.dynamicProgramming.algorithms;

import java.util.AbstractCollection;
import java.util.Arrays;

/**
 * Created by Amit on 6/2/15.
 */
public class MinimumNumberOfOperationRequired {

    public int matrix[][];

    MinimumNumberOfOperationRequired(String str1, String str2)
    {
        System.out.println(str1.length() + "::"  + str2.length());
        matrix = new int[str2.length() + 1][str1.length() +1];

        for(int i=0;i<=str2.length();i++){
            for(int j=0;j<=str1.length();j++){
                matrix[i][j] = 0;
            }
        }

        for(int i=1;i<=str1.length();i++){
            matrix[0][i] = i;
        }

        for(int i=1;i<=str2.length();i++){
            matrix[i][0] = i;
        }

        System.out.println(Arrays.deepToString(matrix));
        finNumberOfOperation(matrix, str1.toCharArray(), str2.toCharArray());
    }

    public void finNumberOfOperation(int [][] matrix, char[] str1, char[] str2){
        int EDIT_COST = 1;
        for(int i=1;i <=str1.length; i++){
            for(int j=1; j <= str2.length; j++){
                if(str1[i-1] == str2[j-1]){
                    matrix[i][j] = matrix[i-1][j-1];
                }else{
                    matrix[i][j] = min(matrix[i - 1][j - 1] + 1 , matrix[i - 1][j] + EDIT_COST, matrix[i][j - 1] + EDIT_COST);
                    System.out.println(Arrays.deepToString(matrix));
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    private int min(int a,int b, int c){
        int l = Math.min(a, b);
        return Math.min(l, c);
    }
    public static void main(String[] args){
        String str1 = "ABCDEF";
        String str2 = "AZCED";

        MinimumNumberOfOperationRequired mn = new MinimumNumberOfOperationRequired(str1, str2);

    }
}
