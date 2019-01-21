package org.launchcode;

public class Queue {
    Node front;
    Node rear;

    public void enQueue(int data){
        Node node = new Node();
        node.data = data;

        if(front == null && rear == null){
            front = node;
            rear = node;
        }
        else {
            rear.next = node;
            rear = rear.next;
        }
    }

    public void print(){
        Node current = front;
        while(current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    public int deQueue(){
        int temp;
        if(front == null)
            return 0;
        else if(front == rear){
            temp = front.data;
            front = front.next;
            rear = rear.next;
        }else {
            temp = front.data;
            front = front.next;
        }
        return temp;
    }

    public boolean isEmpty(){
        return front == null && rear == null;
    }

    public int front(){
        return front.data;
    }

    public int rear(){
        return rear.data;
    }
}
