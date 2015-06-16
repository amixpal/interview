package com.dynamicProgramming.algorithms;


import java.util.Arrays;

public class LongestCommonSubSequence {
    public  String str1 = "ABCDAF";
    public  String str2 = "ACBCF";
    public int matrix[][];

    LongestCommonSubSequence(){

        matrix = new int[str2.length()+1][str1.length()+1];

        for(int i = 0;i<=str2.length();i++){
            for(int j=0;j<=str1.length();j++){
                matrix[i][j] = 0;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        lcsDynamic(str1.toCharArray(), str2.toCharArray());
    }

    public int lcsDynamic(char str1[],char str2[]){

        int temp[][] = new int[str1.length + 1][str2.length + 1];
        int max = 0;
        System.out.println(Arrays.deepToString(temp));
        for(int i=1; i < temp.length; i++){
            for(int j=1; j < temp[i].length; j++){
                if(str1[i-1] == str2[j-1]){
                    temp[i][j] = temp[i-1][j-1] + 1;
                    if(temp[i][j] > max){
                        max = temp[i][j];
                    }
                }else{
                    temp[i][j] = Math.max(temp[i][j-1],temp[i-1][j]);
                }
            }
        }
        System.out.println(max);
        return max;

    }


    public static void main(String [] args){

        LongestCommonSubSequence lcs = new LongestCommonSubSequence();
    }
}
