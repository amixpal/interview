package com.nonLinear.sorting.algo;

public class BubbleSort {
    public static void main(String[] args) {
        int input[] = {2, 1, 4, 5,0};
        bubbleSort(input);
    }

    public static void bubbleSort(int[] list) {
        for (int i = (list.length - 1); i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (list[j - 1] > list[j]) {
                    // swap elements at j-1 and j
                    int temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
        for(int i=0;i<list.length;i++)
        System.out.println(list[i]);
    }
}
