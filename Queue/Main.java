package org.launchcode;

public class Main {

    public static void main(String[] args) {
	    Queue q = new Queue();

	    StackUsingQueues stack = new StackUsingQueues();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.print();

        int x = stack.pop();
        stack.print();

        int y = stack.pop();
        stack.print();

        int z = stack.pop();
        stack.print();
    }
}
