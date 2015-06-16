package com.com.algorithms;

import java.util.Arrays;
import java.util.Random;

public class LexicographicsSort {
    private Random r = new Random();

    public void quicksort_maxConcatenation(int[] a, int begin, int end) {
        System.out.println(begin + "::" + end);
        if (begin < end) {
            int q = partition(a, begin, end);
            System.out.println(begin + "::" + end);
            quicksort_maxConcatenation(a, begin, q);
            System.out.println(begin + "::" + end);
            quicksort_maxConcatenation(a, q + 1, end);
        }
    }

    private int partition(int[] a, int begin, int end) {
        int p = begin + r.nextInt(end - begin + 1);
        int t1 = a[p];
        a[p] = a[end];
        a[end] = t1;

        int pivot = t1;
        int q = begin;
        for (int i = begin; i < end; i++) {
            if (compare_maxConcatenation(a[i], pivot) > 0) {
                int t2 = a[q];
                a[q] = a[i];
                a[i] = t2;
                q++;

            }
        }
        int t3 = a[q];
        a[q] = a[end];
        a[end] = t3;
        System.out.println(Arrays.toString(a));
        System.out.println(pivot);
        return q;
    }

    private int compare_maxConcatenation(int i, int j) {
        int ij = Integer.valueOf(String.valueOf(i).concat(String.valueOf(j)));
        int ji = Integer.valueOf(String.valueOf(j).concat(String.valueOf(i)));
        if (ij > ji)
            return 1;
        else if (ij == ji)
            return 0;
        return -1;
    }

    public static void main(String[] args) {

        int[] a = new int[]{56, 5,45,72};
        LexicographicsSort smc = new LexicographicsSort();
        smc.quicksort_maxConcatenation(a, 0, a.length - 1);
        for(int i = 0;i < a.length;i++) {
            System.out.print(a[i]);
        }
    }
}