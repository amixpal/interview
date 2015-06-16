/**
 * Created by Amit on 6/8/15.
 */
public class MaxSumDifference {
    public static void main(String [] args){
        int arr[] = {7, 9, 5, 6, 3, 2};
        int diff[] = new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            diff[i] = arr[i+1] - arr[i];
        }

        int maxDiff = diff[0];
        for(int i=1;i<diff.length-1;i++){
            if (diff[i-1] > 0)
                diff[i] += diff[i-1];
            if (maxDiff < diff[i])
                maxDiff = diff[i];
        }
            System.out.println(maxDiff);
    }
}
