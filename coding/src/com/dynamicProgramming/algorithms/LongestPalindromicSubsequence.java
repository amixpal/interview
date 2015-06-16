package com.dynamicProgramming.algorithms;

import java.util.Arrays;

/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-12-longest-palindromic-subsequence/
 */
public class LongestPalindromicSubsequence {

    public int calculate(char []str){
        int T[][] = new int[str.length+1][str.length+1];
        for(int i=0; i < str.length; i++){
            T[1][i] = 1;
        }

        System.out.println(Arrays.deepToString(T));
        for(int c = 2; c <= str.length; c++){
            for(int i = 1; i <= str.length-c+1; i++){
                if(str[i-1] == str[i-1 + c-1] && c == 2){
                    T[c][i] = 2;
                }else if(str[i-1] == str[i+c-2]){
                    T[c][i] = T[c-2][i+1] + 2;
                    System.out.println(Arrays.deepToString(T));
                }else{
                    T[c][i] = Math.max(T[c-1][i+1], T[c-1][i]);
                }
            }
        }
        System.out.println(Arrays.deepToString(T));
        return T[str.length][1];
    }


    public static void main(String args[]){
        LongestPalindromicSubsequence lps = new LongestPalindromicSubsequence();
        String str = "agbdba";
        int  r = lps.calculate(str.toCharArray());
      ///  int r1 = lps.calculateRecursive(str.toCharArray(), 0, str.length());

        System.out.print(r);
    }

}