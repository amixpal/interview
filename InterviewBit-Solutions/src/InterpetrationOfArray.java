import java.util.Arrays;

/**
 * Created by Amit on 6/11/15.
 */

class Node{
    public String dataString;
    public Node left;
    public Node right;

    Node(String data){
        this.dataString = data;
    }
}
public class InterpetrationOfArray {
    private static final String[] alphabet = {"", "a", "b", "c", "d", "e",
            "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
            "s", "t", "u", "v", "w", "x", "v", "z"};

    public static void main(String[] args){
        int arr[] = {1,2,2,1};
        NodeCreate(arr, "", 0);
    }

    public static Node NodeCreate(int [] arr, String nodeValue, int data){

        String dataString = nodeValue+ alphabet[data];

        if(data>26)
            return null;
        if(arr.length!=0) {
            data = arr[0];
            Node root = new Node(dataString);
            if (arr.length == 0)
                System.out.println("We are done");
            int newArr[] = Arrays.copyOfRange(arr, 0, arr.length);
            root.left = NodeCreate(newArr, dataString, data);

            if(arr.length > 1){
                data = arr[0] * 10 + arr[1];
            newArr = Arrays.copyOfRange(arr, 2, arr.length);
                root.right = NodeCreate(newArr,dataString, data);
            }
        }
    return  null;
    }
}
