package org.launchcode;

public class StackUsingTwoQueues {
    Node top;
    Queue q1 = new Queue();
    Queue q2 = new Queue();

    public void push(int data) {
        q1.enQueue(data);
    }

    public int pop() {
        while (!(q1.front == q1.rear)) {
            q2.enQueue(q1.deQueue());
        }
        return q1.deQueue();
    }

    public void print() {
        int data;
        if (q1.isEmpty()) {
            Node current = q2.front;

            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        } else {
            Node current = q1.front;

            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}

