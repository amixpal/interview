package com.com.datastructure;


import java.util.Arrays;
import java.util.LinkedList;

public class Queue {

    public int[] QueueArray;
    public int front;
    public int rear;
    public int maxSize;

    Queue(int size){
        maxSize = size;
        QueueArray = new int[size];
        rear = -1;
        front = 0;
    }

    public void insert(int value){
        if(rear == maxSize-1)
            rear  = -1;
        QueueArray[++rear] = value;
    }

    public int remove(){
        int data = QueueArray[front++];
        if(front == maxSize)
            front = 0;
        return data;

    }

    public boolean isEmpty(){
        return (front == rear+1);

    }

    public static void main(String [] args){
        Queue q = new Queue(9);
        q.insert(34);
        q.insert(50);
        q.insert(67);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }


    }
}
