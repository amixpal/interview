//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//
///**
// * Created by Amit on 6/4/15.
// */
//public class test {
//
//    static class StringNumberList extends ArrayList<Object> {
//        public String origString;
//
//        public StringNumberList(String val) {
//            super();
//            this.origString = val;
//            char[] arr = val.toCharArray();
//            boolean isNumber = false;
//            String strPart = "";
//            int intPart = 0;
//            for (char c : arr) {
//                if (c >= '0' & c <= '9') {
//                    if (isNumber) {
//                        intPart = intPart * 10 + (c - '0');
//                    } else {
//                        if (!strPart.isEmpty()) {
//                            this.add(strPart);
//                            strPart = "";
//                        }
//                        intPart = c - '0';
//                        isNumber = true;
//                    }
//                } else {
//                    if (isNumber) {
//                        this.add(intPart);
//                        intPart = 0;
//                        isNumber = false;
//                        strPart = c + "";
//                    } else {
//                        strPart += c;
//                    }
//                }
//            }
//            if (isNumber) {
//                this.add(intPart);
//            } else {
//                this.add(strPart + "");
//            }
//        }
//    }
//
//    public static void main(String[] args){
//
//        ArrayList<StringNumberList> params = new ArrayList<StringNumberList>();
//        for( String arg:args){
//            params.add(new StringNumberList(arg));
//        }
//        Collections.sort(params, new StringNumberListComparator());
//        for(StringNumberList param: params) {
//            System.out.println(param.origString);
//        }
//    }
//
//}
//class StringNumberListComparator implements Comparator<ArrayList<Object>>{
//
//    @Override
//    public int compare(ArrayList<Object> o1, ArrayList<Object> o2) {
//        int len = (o1.size() > o2.size())?o2.size():o1.size();
//
//        for(int i=0;i<len;i++){
//            Object obj1 = o1.get(i);
//            Object obj2 = o2.get(i);
//            if(obj1 instanceof String && obj2 instanceof String){
//                if(((String) obj1).equals(obj2))continue;
//                else return ((String) obj1).compareTo((String)obj2);
//            }else if(obj1 instanceof String){
//                return 1;
//            }else if(obj2 instanceof String){
//                return -1;
//            }else {
//                if(obj1.equals(obj2))
//                    continue;
//                else return ((Integer)obj1).compareTo((Integer) obj2);
//            }
//        }
//        if(o1.size() == o2.size())return 0;
//        if(o1.size() > o2.size()) return 1;
//        else return -1;
//    }
//}