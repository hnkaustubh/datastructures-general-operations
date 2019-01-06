package org.launchcode;

public class Main {

    public static void main(String[] args) {
	    LinkedList list1 = new LinkedList();

	    list1.head = list1.insert(list1.head, 1);
        list1.head = list1.insert(list1.head, 2);
        list1.head = list1.insert(list1.head, 4);

        list1.head = list1.reverseLinkedList(list1.head);
        list1.print(list1.head);
    }
}
