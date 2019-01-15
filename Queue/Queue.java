package org.launchcode;

public class Queue {
    Node front;
    Node rear;

    public void enQueue(int data){
        Node node = new Node(data);

        if(front == null && rear == null) {
            front = node;
            rear = node;
        }
        else if(front.next == null && rear.next == null){
            front.next = node;
            rear = node;
        }
        else {
            rear.next = node;
            rear = node;
        }
    }

    public int deQueue(){
        int temp;
        if(front != rear) {
            temp = front.data;
            front = front.next;
        }else{
            temp = front.data;
            front = front.next;
            rear = front;
        }
        return temp;
    }

    public int front(){
        return front.data;
    }

    public boolean isEmpty(){
        return front == null;
    }

    public void print(){
        Node current = front;

        while(current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


}
