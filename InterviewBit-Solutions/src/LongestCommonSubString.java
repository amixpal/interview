import java.util.Arrays;

/**
 * Created by Amit on 6/11/15.
 */
public class LongestCommonSubString {
    static String str2= "abcdaf";
    static String str1 = "zbcdf";
    static int size = str1.length();
    static int size2 = str2.length();
   // static int[][] arr = new int[size2+1][size+1];

    public static void main(String[] args){
        FindLongestCommonSubString(str1.toCharArray(), str2.toCharArray());


    }

    public static int FindLongestCommonSubString(char[] str1, char[] str2){
        int arr[][] = new int[str1.length+1][str2.length+1];
        System.out.println(Arrays.deepToString(arr));
     int max = 0;
        arr[1][1] = 1;
    for(int i=1; i <=str1.length; i++){
        for(int j=1; j <=str2.length; j++){
            System.out.println(str1[i-1]);
            System.out.println(str2[j-1]);
            if(str1[i-1] == str2[j-1]){}
//                arr[i][j] = arr[i-1][j-1] +1;
//                if(max < arr[i][j]){
//                    max = arr[i][j];
//                }
//            }
        }
    }
        System.out.println(Arrays.deepToString(arr));
    return max;
    }
}
