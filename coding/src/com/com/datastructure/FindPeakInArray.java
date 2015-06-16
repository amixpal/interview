package com.com.datastructure;


public class FindPeakInArray {
    public static void main(String [] args){
        int input[] = {10,11,12,13,14,13,14,15};
        int low = 0;
        int high = input.length-1;
        int medium = low + (high-low)/2;

        FindInNextArray(input, low, high);
    }



    public static void FindInNextArray(int [] input, int low, int high){
        int index;
        boolean isFind = false;
        int valueDiff;
        int indexDiff;
        if((low-high ) == -1){
            if((input[low-1]>input[low]))
               System.out.println(low + "::dwada");
            else if(input[high-1] > input[high])
                System.out.println(high + "::dwada");

        } else
       {
            int medium = low + (high-low)/2;
            indexDiff = medium - low;
            valueDiff = input[medium]  - input[low];

            if(valueDiff == indexDiff)
            FindInNextArray(input, medium,high);
           else
                FindInNextArray(input,low,medium);


        }

    }
}
