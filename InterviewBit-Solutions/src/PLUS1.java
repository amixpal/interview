import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by Amit on 6/7/15.
 */
public class PLUS1 {
    static ArrayList<Integer> A = new ArrayList<Integer>();
    static ArrayList<Integer> ret = new ArrayList<Integer>();
    static int carry = 1;
    static int v = 0;

    public static void main(String[] args){

        A.add(1);
        A.add(2);
        A.add(3);

        Iterator<Integer> iter = A.iterator();
        while (iter.hasNext()){
            v = iter.next();
            if(v!=0)
                break;
        }

        if(!iter.hasNext() && v == 0) {
            ret.add(carry);
        }else{
            int c = sum(iter, v, carry, ret);
            if(c!=0)
                ret.add(c);
        }
        Collections.reverse(ret);

        System.out.println(ret);
    }

    public static int sum(Iterator<Integer> iter, int v, int carry, ArrayList<Integer> ret){
        if(iter.hasNext()){
            carry = sum(iter, iter.next(), carry, ret);
        }

        v = v + carry;
        carry = v/10;
        v = v%10;
        ret.add(v);
        return carry;

    }


}
