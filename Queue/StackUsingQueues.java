package org.launchcode;

public class StackUsingQueues {
    Queue q1 = new Queue();
    Queue q2 = new Queue();


    public void push(int data){
        if(q1.isEmpty() && q2.isEmpty())
            q1.enQueue(data);
        else if(!q1.isEmpty())
            q1.enQueue(data);
        else if(!q2.isEmpty())
            q2.enQueue(data);
    }

    public int pop(){
        if(q1.isEmpty()){
            if(q2.isEmpty()){
                System.out.print("Error");
            }else{
                while(!(q2.front == q2.rear)){
                    int x = q2.deQueue();
                    q1.enQueue(x);
                }
            }
            return q2.deQueue();
        }else{
            while(!(q1.front == q1.rear)) {
                int x = q1.deQueue();
                q2.enQueue(x);
            }
        }
        return q1.deQueue();
    }

    public void print(){
        if(q1.isEmpty()){
            if(q2.isEmpty()){
                System.out.print("Error");
            }else{
                q2.print();
            }
        }else{
            q1.print();
        }
    }
}
