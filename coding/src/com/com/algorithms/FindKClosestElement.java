package com.com.algorithms;


public class FindKClosestElement {
    public static void main(String[] args){
        int input[] = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56};
       int index =  FindKClose(input, 4,35);
        if(index == -1){
            System.out.println("Not found");
        }
        Findmin(input, index, 4, 35);
    }

    public static int FindKClose(int [] input, int k, int number){
        int low = 0;
        int high = input.length-1;

        while (low<=high) {
            int middle = (low +  high) / 2;

            if (input[middle] == number) {
                System.out.println("Found");
                return middle;
            }

            if (input[middle] < number) {
                low = middle + 1;
            }
            if (input[middle] > number) {
                high = middle - 1;
            }
        }
        return -1;
    }

    public static void Findmin(int [] input, int index, int k, int value){
        System.out.println(index);
        int low = index;
        int high = index+1;
        int max = input[index];
        int min = input[index];
        int count= 0;

       while(low > 0 && (high < input.length-1) && count<k){
           if (value - input[low] < input[high] - value)
               System.out.println(input[low--]);
           else
               System.out.println(input[high++]);
           count ++;
       }
    }
}
