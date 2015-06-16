/**
 * Created by Amit on 6/12/15.
 */
public class BinarySearch {
    static int arr[] = {2, 3, 4, 10, 40};

    public static void main(String[] args){
        int size = arr.length;
        System.out.println(binarySearch(arr, 0, size-1, 3));
    }

    public static int binarySearch(int[] arr, int min, int max, int x){
      if(max>=min){
          int mid = min + (max-1)/2;
          if(arr[mid]==x)
              return mid;

          if(arr[mid] > x)
              return binarySearch(arr, min, mid-1, x);
          return binarySearch(arr, mid+1, max, x);

      }
        return -1;

    }
}
