package org.launchcode;

public class DoublyLinkedList {
    Node head;
    Node tail;

    public Node insert(Node head, int data){
        Node node = new Node();
        node.data = data;

        if(head == null && tail == null) {
            head = node;
            tail = head;
        }
        else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        return head;
    }

    public void print(Node head){
        if(head == null)
            return;
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public Node delete(Node head, int data){
        Node current = head;

        while(current != null && current.data != data)
            current = current.next;
        current.prev.next = current.next;
        return head;
    }

    public Node reverseDoublyLinkedList(Node head){
        Node current = head;
        Node temp = null;

        while(current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        return temp.prev;
    }

    public Node insertIntoSortedDList(Node head, int data){
        Node current = head;
        Node node = new Node();
        node.data = data;

        while(current != null && current.data < data)
            current = current.next;


        current.prev.next = node;
        node.prev = current.prev;
        current.prev = node;
        node.next = current;

        return head;
    }
}
