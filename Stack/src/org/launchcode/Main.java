package org.launchcode;

import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	    Stack stack = new Stack();

	    stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.print(stack.top);

        System.out.println();
        int top = stack.pop();
        stack.print(stack.top);

        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);

        queue.print();
    }
}
