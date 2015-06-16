//
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//
//public class test {
//
////    public static int lengthOfLongestSubstring(String s) {
////
////        char[] arr = s.toCharArray();
////        int pre = 0;
////
////        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
////
////        for (int i = 0; i < arr.length; i++) {
////            if (!map.containsKey(arr[i])) {
////                map.put(arr[i], i);
////            } else {
////                pre = Math.max(pre, map.size());
////                i = map.get(arr[i]);
////                System.out.println(i);
////                i = i+1;
////                map.clear();
////            }
////        }
////
////        return Math.max(pre, map.size());
////    }
//
//    public static void lengthOfLongestSubstring(String arr) {
//        char[] value = arr.toCharArray();
//        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//        int pre = 0;
//
//        for (int i = 0; i < value.length; i++) {
//            if (!map.containsKey(value[i])) {
//                map.put(value[i], i);
//
//            } else {
//                pre = Math.max(pre, map.size());
//                i = map.get(value[i]);
//
//                map.clear();
//            }
//        }
//        System.out.println(pre);
//    }
//
//
//    public static void main(String[] args)
//    {
//        String arr = "abaabbcbb";
//       // lengthOfLongestSubstring(arr);
//        reverse(1234);
//
//
//       // System.out.println(lengthOfLongestSubstring(arr));
//
//    }
//
//
//    public static void printPermutation(char[] str, int start, int end){
//           for(int i=start;i<end;i++){
//               swap(str[i], str[i]);
//               printPerm\tation(str, start+1, end);
//           }
//    }
//
//
//
//    public static void reverse(int inte){
//        int n = 0;
//        int reverse = 0;
//        while (inte !=0){
//
//        int value = inte/10;
//            System.out.println(value);
//
//        }
//
////        while (inte != 0)
////        {
////            reverse = reverse * 10;
////            reverse = reverse + inte%10;
////
////            inte       = inte/10;
////        }
//
//        System.out.println("Reverse of entered number is"+ reverse);
//
//    }
//}
