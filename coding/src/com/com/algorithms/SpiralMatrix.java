package com.com.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Amit on 6/5/15.
 */
public class SpiralMatrix {

    public static int [][] tempArray;
    public static List<Integer> list;

    public static void printSpiral(int n) {
        //  tempArray = new int[number][number];

        int A[][] = new int[n][n];
        int k = 1, c1 = 0, c2 = n - 1, r1 = 0, r2 = n - 1;
        System.out.println(k +""+c1 +""+c2+""+ r1 +""+r2);

        while (k <= n * n) {
            for (int i = c1; i <= c2; i++) {
                A[r1][i] = k++;
            }

            System.out.println(Arrays.deepToString(A));

            for (int j = r1 + 1; j <= r2; j++) {
                A[j][c2] = k++;
            }
            System.out.println(Arrays.deepToString(A));

            for (int i = c2 - 1; i >= c1; i--) {
                A[r2][i] = k++;
            }
            System.out.println(Arrays.deepToString(A));

            for (int j = r2 - 1; j >= r1 + 1; j--) {
                A[j][c1] = k++;
            }
            System.out.println(Arrays.deepToString(A));

            c1++;
            c2--;
            r1++;
            r2--;
        }

        System.out.println(Arrays.deepToString(A));
    }



    public static void main(String[] args){
        int n = 3;

        printSpiral(n);
    }

}
