package org.launchcode;

public class Main {

    public static void main(String[] args) {
	    LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.head = l1.insert(l1.head, 1);
        l1.head = l1.insert(l1.head, 2);
        l1.head = l1.insert(l1.head, 3);

        l1.print(l1.head);

        l2.head = l2.insert(l2.head, 4);
        l2.head = l2.insert(l2.head, 5);
        l2.head = l2.insert(l2.head, 6);

        System.out.println();
        l2.print(l2.head);

        LinkedList l3 = new LinkedList();

        l3.head = l1.addTwoNumbers(l1.head, l2.head);

        System.out.println();
        l3.print(l3.head);
    }
}
