/*
 * @author: Amit Pal
 * 
 */

import java.util.Arrays;
import java.util.Comparator;

public class StringNumberSort {
    private static void mergeSort(String[] arr, Comparator<String> comparator, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(arr, comparator, low, middle);
            mergeSort(arr, comparator, middle + 1, high);
            merge(arr, comparator, low, middle, high);
        }
    }
    private static void merge(String[] arr, Comparator<String> comparator,int low, int middle, int high) {
        String[] tmpArr = new String[arr.length];
        for (int i = low; i <= high; i++) {
            tmpArr[i] = arr[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;
        while (i <= middle && j <= high) {
            if (comparator.compare(tmpArr[i], tmpArr[j])<0) {
                arr[k] = tmpArr[i];
                i++;
            } else {
                arr[k] = tmpArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            arr[k] = tmpArr[i];
            k++;
            i++;
        }

    }

    static class SNComparator implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            int pos1 = 0;
            int pos2 = 0;
            while (true) {
                if (pos1 >= s1.length() || pos2 >= s2.length())
                    break;
                char c1 = s1.charAt(pos1);
                char c2 = s2.charAt(pos2);
                if (c1 >= '0' && c1 <= '9' && c2 >= '0' && c2 <= '9') {
                    Object[] r1 = parseNum(s1, pos1);
                    Object[] r2 = parseNum(s2, pos2);
                    pos1 = (int)r1[0];
                    pos2 = (int)r2[0];
                    if ((long)r1[1] > (long)r2[1])
                        return 1;
                    if ((long)r1[1] < (long)r2[1])
                        return -1;
                } else {
                    if (c1 > c2)
                        return 1;
                    else if (c1 < c2)
                        return -1;
                    pos1++;
                    pos2++;
                }
            }
            if (pos1 == s1.length() && pos2 == s2.length())
                return 0;
            if (pos1 == s1.length())
                return -1;
            else
                return 1;

        }

        // To get the number from given String
        private Object[] parseNum(String s1, int pos1) {
            long ret = 0;
            int resPos = pos1;
            while (true) {
                if (resPos >= s1.length())
                    break;
                char c = s1.charAt(resPos);
                if (c >= '0' && c <= '9') {
                    ret = ret * 10 + (c - '0');
                    resPos++;
                } else {
                    break;
                }
            }
            return new Object[] { resPos, ret };
        }

    }
    public static void main(String[] args) {

        mergeSort(args, new SNComparator(),  0, args.length -1);
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
