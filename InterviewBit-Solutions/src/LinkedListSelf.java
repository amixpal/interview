/**
 * Created by Amit on 6/9/15.
 */

class NodeList{
     int data;
    NodeList next;

    NodeList(int data2){
        data = data2;
        next = null;
    }
}
 class LinkedListSelf {

     private NodeList head;

     public void append(int val) {
         NodeList lastNode = getLastNode();
         if (lastNode == null) {
             head = new NodeList(val);
         } else {
             lastNode.next = new NodeList(val);
         }
     }

     private NodeList getLastNode() {
         if (head == null) {
             return null;
         }
         NodeList tmpNode = head;
         while (tmpNode.next != null) {
             tmpNode = tmpNode.next;

         }
         return tmpNode;
     }

     public void print() {
         System.out.println("");
         if(head == null){
             System.out.print("EMPTY");
             return;
         }
         NodeList tmpNode = head;
         while (tmpNode != null) {
             System.out.print(tmpNode.data + " -> ");
             tmpNode = tmpNode.next;

         }
     }
    public static void main(String[] args){
        LinkedListSelf ls = new LinkedListSelf();
        ls.append(12);
        ls.append(33);

        ls.print();

    }
}
