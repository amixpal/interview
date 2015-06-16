

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by Amit on 6/7/15.
 */
public class MaxSum {
    static ArrayList<Integer> A = new ArrayList<Integer>();

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size  =scn.nextInt();
       for(int i=0;i<size;i++)
           A.add(scn.nextInt());

        int max = A.get(0);
        int len = A.size();
        int[] sum = new int[len];
        sum[0]=max;
        for (int i = 1; i < A.size(); i++) {
            sum[i] = Math.max(A.get(i), sum[i - 1] + A.get(i));
            max = Math.max(max, sum[i]);
        }
        System.out.println(max);

    }
}
