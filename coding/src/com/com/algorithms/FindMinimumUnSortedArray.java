package com.com.algorithms;


import java.util.Arrays;

public class FindMinimumUnSortedArray {
    public static int low;
    public static int high;
    public static void main (String[] args){
        int input[] = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        FindArray(input);
    }

    public static void FindArray(int[] input){

        for(int i =0; i<input.length-1;i++){
            if(input[i+1] < input[i]){
                low = i;
                System.out.println(low);
                break;
            }
        }

        for(int i = input.length-1 ; i>0; i--){
            if(input[i-1] > input[i]){
                high = i;
                System.out.println(high);
                break;
            }
        }

        // find min and max in array
            int min = input[low];
            int max = input[low];
        for(int i = low+1; i<high;i++){
            if(input[i] > max){
                max = input[i];
                System.out.println(max);
            }
            if(input[i] < min){
                min = input[i];
                System.out.println(min);

            }
        }

        for(int i=0;i<=low;i++){
            System.out.println(input[i]);
        }

        for(int i = high;i< input.length;i++){
            System.out.println(input[i]);
        }


    }
}
