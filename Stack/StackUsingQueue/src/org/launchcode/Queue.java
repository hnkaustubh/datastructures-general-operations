package org.launchcode;

public class Queue {
    Node front;
    Node rear;

    public void enQueue(int data) {
        Node node = new Node();
        node.data = data;

        if(front == null && rear == null){
            front = node;
            rear = node;
        }else {
            rear.next = node;
            rear = node;
        }
    }

    public int deQueue() {
        int data;
        if(front == rear){
            data = front.data;
            front = null;
            rear = null;
        }else {
            data = front.data;
            front = front.next;
        }
        return data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void print() {
        Node current = front;

        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int sizeOf() {
        int size = 0;
        Node current = front;

        while(current != null) {
            size++;
            current = current.next;
        }
        return size;
    }
}
