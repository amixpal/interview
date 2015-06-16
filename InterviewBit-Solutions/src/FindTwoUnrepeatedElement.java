/**
 * Created by Amit on 6/7/15.
 */
public class FindTwoUnrepeatedElement {

    public static void main(String[] args) {
        int arr[] = {2, 3 , 5, 5};
        int xor = arr[0];
        int set_bit_no;
        int x = 0;
        int y = 0;
        int len = arr.length;

        for(int i=1;i<arr.length;i++)
            xor ^=arr[i];
        set_bit_no = xor & ~(xor-1);


        for(int i=0;i<len;i++){
            if((arr[i] & set_bit_no)>0) {
                x = arr[i] ^ x;
                System.out.println(x +"::x");
            }
            else {
                y = arr[i] ^ y;
                System.out.println(y + "::Y");
            }
        }

        System.out.println(x + "::" +y);
    }

}


