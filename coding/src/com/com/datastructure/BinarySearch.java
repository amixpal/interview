package com.com.datastructure;


public class BinarySearch {
    public static void main(String[] args){
        int input[] = {2,3,4,56};
        int search = 4;
        boolean value = BSearch(input, input.length, search);
        System.out.print(value);
    }

    public static boolean BSearch(int data[], int size, int key){
        int low = 0;
                int high = size - 1;

                 while(low<=high) {
                         int middle = (low + high) / 2;
                         if(data[middle] == key) {
                                 return true;
                             }
                       if(data[middle] < key) {
                                 low = middle + 1;
                             }
                       if(data[middle] > key) {
                                 high = middle - 1;
                             }
                    }
                return false;
    }
}
