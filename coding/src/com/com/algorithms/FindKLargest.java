package com.com.algorithms;


import java.util.Arrays;

public class FindKLargest {

    public static int[] input = {7, 10, 4, 3,70};

    public static void main(String[] args) {
//       int output =  findArray(input, 0, input.length - 1, 2);
//        System.out.println(output);
            balanceArray(input, 0, input.length-1);
    }

    public static int findArray(int[] input, int l, int h, int k) {
        System.out.println("K:" + k);

        if (k > 0 && k <= h - l + 1) {
            int position = balanceArray(input, l, h);
            System.out.println(Arrays.toString(input));
            System.out.println("position::" + position);

            int num_from_last  =h - position +1;
            if (k  == num_from_last) {
                return input[position];
            }

            if (num_from_last < k ) {
                 k = k- num_from_last ;
                 return findArray(input, l, position - 1 , k);
            } else {
                return findArray(input, position+1, h, k);
            }

        }
        return -1;
    }

    public static int balanceArray(int[] arr, int low, int high) {
        // pick the pivot

        int pivot = arr[high];

        // make left < pivot and right > pivot
        int i = low, j = high-1 ;
        while (i <= j) {
            if (arr[i] < pivot) {
                i++;
                continue;
            }

            if (arr[j] > pivot) {
                j--;
                continue;
            }

            if (i < j) {
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
                i++;
                j--;
            }

        }
        System.out.println("i"+i);
        System.out.println(Arrays.toString(arr));
        arr[high] = arr[i];
        arr[i] = pivot ;

        return i ;
    }
}
