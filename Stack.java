package com.stackqueue;

import java.util.LinkedList;

public class Stack {
    //inititalizizng linked list
    LinkedList<Integer> linkedList = new LinkedList<Integer>();

    //adding first method
    public void push(Integer data){
        linkedList.addFirst(data);
    }

    //printing list
    public void printStack(){
        System.out.println(linkedList.toString());
    }

    public static void main(String[] args) {
        System.out.println("welcome to stack and queue");

        //creating object of stack class
        Stack stack=new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.printStack();
    }
}
