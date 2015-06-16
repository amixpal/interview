package com.com.algorithms;

public class FindCommonElement {
    public static int [] input1 = {1, 5, 10, 20, 40, 80};
    public static int[] input2 = {6, 7, 20, 80, 100};
    public static int[] input3 = {3,4,15,20,30,70,80,120};

    public static void main (String[] args){

        int size1 = input1.length-1;
        int size2 = input2.length-1;
        int size3 = input3.length-1;
        int i = 0, j=0,k=0;

        while(i < input1.length && j < input2.length && k < input3.length){
            if(input1[i] == input2[j] && input2[j] == input3[k]){
                System.out.println(input1[i]);
                i++;
                j++;
                k++;
            }

           else if(input1[i] < input2[j]){
                i++;
            }

            else if(input2[j] < input3[k]){
                j++;
            }

           else k++;
        }
    }


}
