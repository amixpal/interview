/**
 * Created by Amit on 6/8/15.
 */
public class MaxHeight {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args){
        Node node = createTree(5);
        System.out.println(PrintMaxHeight(node));


    }

    public static int PrintMaxHeight(Node node){
        if(node==null)
            return 0;
      int left =   PrintMaxHeight(node.left);
      int right =   PrintMaxHeight(node.right);
        if(left>right){
            left = left +1;
            return left;
        }
        else{
            right = right + 1;
            return right;
        }



    }

    public static Node createTree(int data){
        Node node = new  Node(data);
        Node node1 = new Node(6);
        Node node2 = new Node(9);
        node.left = node1;
        node.right = node2;
        return node;
    }

}
