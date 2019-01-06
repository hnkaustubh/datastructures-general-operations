package org.launchcode;

public class Main {

    public static void main(String[] args) {
	    DoublyLinkedList dlist = new DoublyLinkedList();

	    dlist.head = dlist.insert(dlist.head, 10);
        dlist.head = dlist.insert(dlist.head, 20);
        dlist.head = dlist.insert(dlist.head, 30);
        dlist.head = dlist.insert(dlist.head, 40);

        dlist.print(dlist.head);

        System.out.println();
        dlist.head = dlist.reverseDoublyLinkedList(dlist.head);
        dlist.print(dlist.head);
    }
}
