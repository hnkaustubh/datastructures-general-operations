package org.launchcode;

public class QueueUsingTwoStacks {
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    public void enQueue(int data){
        Node node = new Node(data);
        stack1.push(data);
    }

    public int poll(){
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int front(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }

    public void print(){
        Node current = stack1.top;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
