package com.linear.Sorting.algo;


import java.util.*;

public class BucketSort{

    public static void sort(int[] a, int maxVal) {
        int [] bucket=new int[maxVal+1];

        for (int i=0; i<bucket.length; i++) {
            bucket[i]=0;
        }

        System.out.println(Arrays.toString(bucket));

        for (int i=0; i<a.length; i++) {
            System.out.println(Arrays.toString(bucket));
            bucket[a[i]]++;
        }

        System.out.println(Arrays.toString(bucket));

        int outPos=0;
        for (int i=0; i<bucket.length; i++) {
            for (int j=0; j<bucket[i]; j++) {
                a[outPos++]=i;
            }
        }
    }


    public static void main(String[] args) {
        int maxVal=5;
        int [] data= {5,3,0,2,4,1,0,5,2,3,1,4};

        System.out.println("Before: " + Arrays.toString(data));
        sort(data,maxVal);
        System.out.println("After:  " + Arrays.toString(data));
    }
}