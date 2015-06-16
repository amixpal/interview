import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Amit on 6/7/15.
 */
public class StringComparator {

    public static void main(String[] args){
        mergeSort(args, 0, args.length-1, new SNComparator());
        for (String arg: args)
            System.out.println(arg);
    }

    public static void mergeSort(String[] arr, int low, int high, Comparator<String> snComparator){
//        if(low<high){ =
//            int middle = low + (high-low)/2;
//            mergeSort(arr, low, middle, new SNComparator());
//            mergeSort(arr, middle+1, high, new SNComparator());
//            merge(arr, middle, low, high, snComparator);
//        }
    }

    static class SNComparator implements Comparator<String>{

        @Override
        public int compare(String s1, String s2) {
            int pos1= 0;
            int pos2=0;

            while (true){
                if(pos1>=s1.length() || pos2>=s2.length())
                    break;
                char c1 = s1.charAt(pos1);
                char c2 = s2.charAt(pos2);

                if(c1 > '0' && c1 < '9' && c2 > '0' && c2 <'9'){
                     Object[] r1 = parseNum(s1,pos1);
                     Object[] r2 = parseNum(s2,pos2);

                    pos1 = (int)r1[0];
                    pos2 = (int)r2[0];

                    if((long)r1[1] > (long)r2[1])
                        return 1;
                    if((long)r1[1] < (long)r2[1])
                        return -1;
                }else{
                    if(c1 > c2)
                        return 1;
                    else if(c1 < c2)
                        return -1;
                    pos1++;
                    pos2++;
                }
            }

            if(pos1==s1.length() && pos2==s2.length())
                return 0;
            if(pos1==s1.length())
                return -1;
            else
                return 1;


        }
    }

    public static Object[] parseNum(String tempString, int position){
        long ret = 0;
        int resPos = position;

        while (true){
            if(resPos >= tempString.length())
                break;
            char c = tempString.charAt(resPos);
            if(c > '0' && c< '9'){
                ret = ret * 10 + (c - '0');
                resPos++;
            }
            else{
                break;
            }
        }
        return new Object[] {resPos , ret};
    }

    private static void merge(String[] arr, int middle, int low, int high, Comparator<String> comparator ) {
        String[] temparray = new String[arr.length];

        for(int i=0;i<arr.length;i++){
            temparray[i] = arr[i];
        }

        int i = low;
        int j = middle+1;
        int k = low;

        while(i<=middle && j<=high){
            if (comparator.compare(temparray[i], temparray[j])<0) {
               arr[k] = temparray[i];
                i++;
            }else{
                arr[k] = temparray[j];
                j++;
            }
            k++;
        }

        while (i<=middle){
            arr[k] = temparray[i];
            i++;
            k++;
        }

    }
}
