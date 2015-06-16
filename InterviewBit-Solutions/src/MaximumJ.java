import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Amit on 6/8/15.
 */
public class MaximumJ {

    static int LMin[];
    static int LMax[];

    public static void main(String [] args){
        int arr[] = {9, 2, 3, 4, 5, 6, 7, 8, 18, 0};
        int len = arr.length;
        LMin = new int[arr.length];
        LMax = new int[arr.length];

        LMin[0]=arr[0];
        for(int i=1;i<arr.length;++i){
            LMin[i] = Math.min(arr[i], LMin[i - 1]);

        }
        LMin[len-1] = arr[len-1];
        for(int i = len-2; i>=0;--i){
            LMax[i]=Math.max(arr[i], LMax[i+1]);
        }

        int i=0;
        int j=0;
        int maxdiff = 0;
        while (i<len && j<len){
            if(LMax[j] > LMin[i]){
                maxdiff = Math.max(maxdiff, j-1);
                j++;
            }
            else{
                i = i+1;
            }

        }

    System.out.println(maxdiff);
    }
}
