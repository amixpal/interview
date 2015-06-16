import java.util.Arrays;

/**
 * Created by Amit on 6/11/15.
 */
public class LongestPalindromeSequence {
    static String str = "agbdba";
    static int size = str.length();
    static int[][] arr = new int[size][size];


    public static void data(char[] str){
        for(int c=0;c<size;c++){
            int i=0;
            for(int j = c+1 ; j<size;j++){
                if(str[i] == str[j] && (j-1 <=1)){
                    arr[i][j] = 2;
                }
                if(str[i] == str[j]){
                    arr[i][j] = arr[i+1][j-1] +2;
                }else{
                    arr[i][j] = Math.max(arr[i+1][j], arr[i][j-1]);
                }
                System.out.println(Arrays.deepToString(arr));
                i++;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

    public static void main(String[] args){
        for(int i=0;i<size;i++){
            arr[i][i] = 1;
        }

       LongestPalindromeSequence lp = new LongestPalindromeSequence();
        lp.data(str.toCharArray());


    }


}