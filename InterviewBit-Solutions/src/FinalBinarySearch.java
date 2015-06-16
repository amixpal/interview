/**
 * Created by Amit on 6/11/15.
 */

class NodeBinary{
    public  int data;
    public NodeBinary left;
    public NodeBinary right;

    NodeBinary(){

    }

    NodeBinary(int value){
        data = value;
        left = right = null;
    }
}
public class FinalBinarySearch {

    static int[] arr= {10, 5, 1, 7, 40, 50};
    static int size = arr.length;
    public static void main(String[] args){
        NodeBinary node = binaryPreorderToTree(arr, arr.length);
        InorderTraversal(node);
    }

    private static void InorderTraversal(NodeBinary node) {
        if(node==null)
            return;
        InorderTraversal(node.left);
        System.out.println(node.data);
        InorderTraversal(node.right);
    }

    public static NodeBinary binaryPreorderToTree(int[] arr, int length) {
        if (length <= 0) {
            return null;
        }

        return binaryPreorderToTree(
                arr, length, Integer.MIN_VALUE, Integer.MAX_VALUE, new MutableIndex());
    }
    static class MutableIndex{
        int index = 0;
    }
    private static NodeBinary binaryPreorderToTree(
            int[] arr, int length, int min, int max, MutableIndex m) {

        if (m.index >= length) {
            return null;
        }

        NodeBinary root = null;

        int currentNode = arr[m.index];

        if (currentNode > min && currentNode < max) {
            root = new NodeBinary(currentNode);

              //  System.out.println(root.data);
            m.index++;
            root.left = binaryPreorderToTree(arr, length, min, currentNode, m);

             //   System.out.println(root.data);
            root.right = binaryPreorderToTree(arr, length, currentNode, max,m);

        }

        return root;
    }
}
