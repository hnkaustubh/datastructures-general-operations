package org.launchcode;

public class LinkedList {
    Node head;

    public Node insert(Node head, int data){
        Node node = new Node();
        node.data = data;

        if(head == null)
            head = node;
        else{
            Node current = head;

            while(current.next != null)
                current = current.next;
            current.next = node;
        }
        return head;
    }

    public void print(Node head){
        Node current = head;

        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public Node addTwoNumbers(Node l1, Node l2){
        Node dummy = new Node();
        dummy.data = 0;
        Node l3 = dummy;
        int carry = 0;

        while(l1 != null && l2 != null){
            int digitValue = (l1.data + l2.data + carry) % 10;
            carry = (l1.data + l2.data + carry) / 10;
            Node newNode = new Node();
            newNode.data = digitValue;
            l3.next = newNode;
            l3 = newNode;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int digitValue = (l1.data + carry) % 10;
            carry = (l1.data + carry) / 10;
            Node newNode = new Node();
            newNode.data =digitValue;
            l3.next = newNode;
            l3 = newNode;
            l1 = l1.next;
        }

        while(l2 != null){
            int digitValue = (l2.data + carry) % 10;
            carry = (l2.data + carry) / 10;
            Node newNode = new Node();
            newNode.data =digitValue;
            l3.next = newNode;
            l3 = newNode;
            l2 = l2.next;
        }

        if(carry != 0){
            Node newNode = new Node();
            newNode.data = carry;
            l3.next = newNode;
            l3 = newNode;
        }

        return dummy.next;
    }
}
