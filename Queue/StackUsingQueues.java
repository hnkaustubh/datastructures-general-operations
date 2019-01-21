package org.launchcode;

public class StackUsingTwoQueues {
    Node top;
    Queue q1 = new Queue();
    Queue q2 = new Queue();

    public void push(int data) {
        if(q1.isEmpty() && q2.isEmpty())
            q1.enQueue(data);
        else if(q1.isEmpty())
            q2.enQueue(data);
        else if(q2.isEmpty())
            q1.enQueue(data);
    }

    public int pop() {
        int data;

        if(!q1.isEmpty()) {
            while (!(q1.front == q1.rear)) {
                q2.enQueue(q1.deQueue());
            }
            data = q1.deQueue();
        }else{
            while (!(q2.front == q2.rear)) {
                q1.enQueue(q2.deQueue());
            }
            data = q2.deQueue();
        }
        return data;
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

