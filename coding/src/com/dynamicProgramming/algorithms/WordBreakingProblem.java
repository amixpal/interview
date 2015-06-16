package com.dynamicProgramming.algorithms;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordBreakingProblem {

    public  static int matrix[][];
    WordBreakingProblem(Set<String> dict , String aval, int len){
        int k = len;
        System.out.println(k);
        matrix = new int[k][k];

        for(int i=0; i <k; i++){
            for(int j=0; j <k; j++){
                matrix[i][j] = -1; //-1 indicates string between i to j cannot be split
            }
        }



        for(int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                String test = aval.substring(i,j+1);
                if(dict.contains(test)){
                    matrix[i][j] = 1;
                    System.out.println(Arrays.deepToString(matrix));
                    continue;
                }else{
                    for (int l=i; l<j;l++){
                            int data1 = matrix[i][l];
                            int data2 = matrix[l+1][j];
                            if((data1 & data2) != 0 ){
                                matrix[i][j] = 1;
                            }
                        System.out.println(Arrays.deepToString(matrix));
                        break;
                    }

                }
                System.out.println(Arrays.deepToString(matrix));

            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args){
        Set<String> dictionary = new HashSet<String >();
        dictionary.add("I");
        dictionary.add("am");
        dictionary.add("ace");
        dictionary.add("a");
        String stringToCheck = "Iamace";




       WordBreakingProblem ww = new WordBreakingProblem(dictionary, stringToCheck, stringToCheck.length());
    }


}
