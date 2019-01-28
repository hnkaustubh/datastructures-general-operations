package org.launchcode;

public class StackUsingQueue {
    Node top;
    Queue q = new Queue();

    public void push(int data) {
        int size = q.sizeOf();
        q.enQueue(data);
        for(int i=0; i<size; i++)
            q.enQueue(q.deQueue());
    }

    public int pop() {
        return q.deQueue();
    }

    public void print() {
        q.print();
    }
}
