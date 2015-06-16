package com.nonLinear.sorting.algo;

import java.util.Arrays;

public class HeapSortSelf {

    public static int input[] = {24,5,0,54,34};
    public static int largest;
    public static int length;
    public static int left;
    public static int right;
    public static void main(String[] args){

        buildHeap();
       System.out.println(Arrays.toString(input));
    }

    public static void buildHeap() {
        length = input.length-1;
        for (int i = length / 2; i >= 0; i--) {
            MaxHeap(i, input);
        }
    }

    public static void MaxHeap(int i, int [] a) {
        left=2*i;
        right=2*i+1;


        if(left <= length && a[left] > a[i]){

            largest=left;
        }
        else{
            largest=i;
        }


        if(right <= length && a[right] > a[largest]){



            largest=right;
        }
        if(largest!=i){
            swap(i, largest);
            MaxHeap(largest, a);
        }
    }

    private static void swap(int i, int largest) {

            int temp = input[i];
            input[i] = input[largest];
            input[largest] = temp;
    }
}

