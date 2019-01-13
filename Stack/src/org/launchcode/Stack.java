package org.launchcode;

public class Stack {
    Node top;

    public void push(int data){
        Node node = new Node(data);

        if(top == null)
            top = node;
        else{
            node.next = top;
            top = node;
        }
    }

    public void print(Node top){
        if(top == null)
            return;
        Node current = top;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int pop(){
        Node temp = top;
        top = top.next;
        return temp.data;
    }

    public int peek(){
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }
}
