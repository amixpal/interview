package com.com.algorithms;


import java.util.HashMap;

public class LRUCache {
    HashMap<Integer, DoublyLinkedList> map = new HashMap<Integer, DoublyLinkedList>();
    public DoublyLinkedList head;
    public DoublyLinkedList end;
    private int capacity;
    private int len;

    public LRUCache(int capacity){
        this.len = capacity;
        len = 0;
    }

    public int get(int key){
        if(map.containsKey(key)){
            DoublyLinkedList node = new DoublyLinkedList();
            removeNode(node);
            setHead(node);
            return node.value;
        }else{
            return -1;
        }
    }

    public  void set(int key, int value){
        if(map.containsKey(key)){
            DoublyLinkedList n = map.get(key);
            n.value = value;
            removeNode(n);
            setHead(n);
        }
        else{
            if(len<capacity){
                DoublyLinkedList node = new DoublyLinkedList();
                node.value = value;
                node.key = key;
                len = len+1;
                map.put(key,node);
            }else{
                map.remove(end.key);
                removeNode(end);
                DoublyLinkedList d = new DoublyLinkedList();
                setHead(d);
                map.put(key,d);
            }
        }
    }

    public void setHead(DoublyLinkedList node){
        if(head==null){
            head=node;
            end = node;}
        else{
            head.pre = node;
            node.next = head;
            head =node;
        }
    }
    public void removeNode(DoublyLinkedList node){
        DoublyLinkedList curr = node;
        DoublyLinkedList prev = curr.pre;
        DoublyLinkedList post = curr.next;

        if(prev==null){
            head = post;
        }else{
            prev.next=head;
        }
        if(post==null)
            prev=end;
        else
            post.pre = end;

    }
}


class DoublyLinkedList{
    public int value;
    public int key;

    public DoublyLinkedList pre;
    public DoublyLinkedList next;

}
