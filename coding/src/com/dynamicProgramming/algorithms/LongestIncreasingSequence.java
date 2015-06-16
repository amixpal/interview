package com.dynamicProgramming.algorithms;


import java.util.Arrays;

public class LongestIncreasingSequence {

    public static int[] arr= {3,4,-1,0,6,2,3};

    public static void main(String[] args){

        int tempArray[] = {1,1,1,1,1,1,1};
        int i = 1;
        int j=0;
        while(i < 7 && j < 7){
            if(arr[i] > arr[j]){
                if((tempArray[i]!=1))
                    tempArray[i] = 1;
                tempArray[i] = tempArray[i] + tempArray[j];

            }
            j++;

            if(i==j){
                i = i+1;
                j = 0;
            }

            System.out.println(Arrays.toString(tempArray));
            System.out.println("value of i::" + i + "value of j::" + j);

        }

    }
}
