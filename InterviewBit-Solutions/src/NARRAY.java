/**
 * Created by Amit on 6/8/15.
 */
public class NARRAY {
    public static void main(String[] args){
        int arr[] = {7, 3, 4, 7, 5, 6, 2};

        for(int i=0;i<arr.length;i++)
        {
            if(arr[Math.abs(arr[i])-1] > 0)
                arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
            else
               System.out.println(Math.abs(arr[i]));
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0)
                System.out.println(i + 1);
        }
    }
}
