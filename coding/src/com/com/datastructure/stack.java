package com.com.datastructure;

public class stack {

    public int[] stackArray;
    public int top;

    stack(int size){
        stackArray = new int[size];
        top = -1;
    }

    public void push(int number){
        stackArray[++top] = number;

    }

    public int pop(){
        return stackArray[top--];

    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public static void main(String [] args){
        stack st = new stack(10);
        st.push(34);
        st.push(50);
        st.push(45);

        while(!st.isEmpty()){

            System.out.println(st.pop());
        }


    }
}
