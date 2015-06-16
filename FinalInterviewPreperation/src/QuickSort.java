import java.util.Arrays;

/**
 * Created by Amit on 6/13/15.
 */
public class QuickSort {

    static int arr[] = {34,12,1,76,88};

    public static void main(String[] args){
        int len = arr.length;
        quickSort(0, len-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int low, int high){
        int i = low;
        int j = high;
        int pivot = arr[low + (high-low)/2];

        while (i<=j){
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }

            if(i<=j){
                swap(i,j);
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(low, j);
        if (i < high)
            quickSort(i, high);
    }

    private static void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
