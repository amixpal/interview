/**
 * Created by Amit on 6/8/15.
 */
public class FindLeafNode {

    static class Node{
        public int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args){
        Node node = new Node(5);
        InsertNode(node, 3);
        InsertNode(node, 7);
        InsertNode(node, 1);

       // printInOrder(root);

    }

    public  void PrintLeafNodes(Node node){
        if(node==null)
            System.out.println("Empty dude");
        if(node.left == null && node.right==null)
            System.out.println(node.data);
        PrintLeafNodes(node.left);
        PrintLeafNodes(node.right);

    }

    public void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
           // System.out.println("  Traversed " + node.value);
            printInOrder(node.right);
        }
    }

    public static void InsertNode(Node node, int data){
        if(data < node.data) {
            if (node.left != null) {
                InsertNode(node.left, data);
            }else{
                node.left= new Node(data);
            }
        } else if(data > node.data){
            if(node.right !=null){
                InsertNode(node.right, data);
            }else{
                node.right = new Node(data);
            }
        }
    }
}

