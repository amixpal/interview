import java.util.Arrays;

/**
 * Created by Amit on 6/13/15.
 */
public class HeapSort {
static int arr[] = {23,12,45,65};
    static int length;

    static int left;
    static int right;
    public static void main(String[] args){
        length = arr.length-1;
        for (int i = length / 2; i >= 0; i--) {
            heapSort(i, arr);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(int index, int [] arr){
         left = 2*index;
         right = 2*index+1;
        int largest;

        if(left <= length && arr[left] > arr[index]){
            largest = left;
        }else{
            largest = index;
        }

        if(right<=length && arr[right] > arr[largest]){
            largest= right;
        }

        if(largest!=index){
            swap(largest, index);
            heapSort(largest,arr);
        }
    }

    private static void swap(int largest, int index) {
        int temp = arr[index];
        arr[index] =arr[largest];
        arr[largest] = temp;
    }
}
