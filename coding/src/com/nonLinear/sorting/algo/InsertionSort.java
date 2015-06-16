package com.nonLinear.sorting.algo;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int input[] = {4,0,2,1};
        InsertionAlgo(input);
        System.out.println(Arrays.toString(input));
    }

    public static void InsertionAlgo(int input[]){
        for(int i=1;i<input.length;i++){
            int next = input[i];
            int j = i;
            while(j>0 && input[j-1] > next){
                input[j] = input[j-1];
                j--;
            }

                input[j] = next;

        }
    }
}
