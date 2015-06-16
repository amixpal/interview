import java.util.Arrays;

class MergeSort{
     static int[] arr = {34,12,1,76,88};
     static int[] helper;

     public static void main(String[] args){
         int size = arr.length;
         helper= new int[arr.length];
         mergeSort(0, size-1);
         System.out.println(Arrays.toString(arr));
     }

     public static void mergeSort(int low, int high) {
         if (high > low) {
             int middle = low + (high-low)/2;
             mergeSort(low, middle);
             mergeSort(middle+1, high);
             merge(low, high, middle);
         }
     }

     public static void merge(int low, int high, int middle){
         for(int i=low;i<=high;i++){
             helper[i] = arr[i];
         }

         int i = low;
         int j = middle+1;
         int k = low;

         while (i<=middle && j<=high){
             if (helper[i] <= helper[j]) {
                 arr[k] = helper[i];
                 i++;
             } else {
                 arr[k] = helper[j];
                 j++;
             }
             k++;
         }

         while (i<=middle){
             arr[k] = helper[i];
             k++;
             i++;
         }
     }
 }