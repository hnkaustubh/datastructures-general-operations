package org.launchcode;

public class Stack{
    StackNode top;

    public void push(int data){
        StackNode node = new StackNode();
        node.data = data;

        node.next = top;
        top = node;
    }

    public int pop(){
        int temp = top.data;
        top = top.next;
        return temp;
    }

    public int peek(){
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void show(){
        StackNode n = top;

        while(n != null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public int lastElement(){
        return top.data;
    }

    public int minElement(){
        Stack minStack = new Stack();
        Stack unwanted = new Stack();

        minStack.push(pop());
        while(!isEmpty()){
            if(peek() < minStack.peek()){
                minStack.push(pop());
            }
            else{
                unwanted.push(pop());
            }
        }
        return minStack.peek();
    }
}








