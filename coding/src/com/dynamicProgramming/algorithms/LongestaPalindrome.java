package com.dynamicProgramming.algorithms;


import java.util.Arrays;

public class LongestaPalindrome {
    public static String palindrome = "agbdba";
    public int matrix[][];

    LongestaPalindrome(){
        matrix = new int[palindrome.length()+1][palindrome.length()+1];
        for(int i=0;i<palindrome.length();i++){
            matrix[i][0] = 1;
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args){
        LongestCommonSubSequence lc = new LongestCommonSubSequence();

    }
}
