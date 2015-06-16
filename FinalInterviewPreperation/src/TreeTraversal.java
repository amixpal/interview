/**
 * Created by Amit on 6/12/15.
 */

class Node{
    public int data;
    public Node left;
    public Node right;

    Node(){
    }
    Node(int value){
        this.data = value;

    }
}

public class TreeTraversal {

    public static void main(String[] args){
        Node node = CreateBinaryTree();
        PreOrder(node);
        Inorder(node);
        PostOrder(node);

    }

    public static void Inorder(Node node){
        if(node==null)
            return;

            Inorder(node.left);
            System.out.println(node.data);
            Inorder(node.right);

    }

    public static void PostOrder(Node node){
        if(node==null)
            return;
        PostOrder(node.left);
        PostOrder(node.right);
        System.out.println(node.data);


    }

    public static void PreOrder(Node node){
        if(node==null)
            return;
        System.out.println(node.data);
        PreOrder(node.left);
        PreOrder(node.right);

    }

    public static Node CreateBinaryTree(){
        Node node = new Node(45);
        Node node1 = new Node(78);
        Node node2 = new Node(89);
        Node node3 = new Node(90);
        Node node4 = new Node(56);

        node.left = node1;
        node.right = node2;
        node1.left = node3;
        node1.right = node4;

        return  node;
    }
}
