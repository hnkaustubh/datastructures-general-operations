package org.launchcode;

public class Main {

    public static void main(String[] args) {
        Stack myStack = new Stack();

        System.out.println(myStack.isEmpty());
        System.out.println();
        myStack.push(2555);
        myStack.push(205);
        myStack.push(2578);
        myStack.push(305);
        myStack.push(3555);
        myStack.show();
        System.out.println();
        System.out.println(myStack.lastElement());
        System.out.println();
        System.out.println(myStack.minElement());
//        System.out.println();


//        myStack.pop();
//        myStack.reverseStack();
//        System.out.println("Stack after 1 element was popped out");
//        myStack.show();
//        System.out.println("Peek of the Stack now is: "+myStack.peek());
//        System.out.println();
//        System.out.println(myStack.pop());;
//        System.out.println();
//        myStack.show();
//        System.out.println();
//        System.out.println(myStack.maxElement());
//        System.out.println();
//        myStack.sortStack();
//        System.out.println();
    }
}
