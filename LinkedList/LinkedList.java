package org.launchcode;
import java.util.Hashtable;

public class LinkedList {
    Node head;

    public Node getNode(int data){
        Node node = new Node();
        node.data = data;
        return node;
    }

    public Node insert(Node head, int data){
        if(head == null)
            head = getNode(data);
        else{
            head.next = insert(head.next, data);
        }
        return head;
    }

    public void print(Node head){
        if(head == null)
            return;
        System.out.println(head.data);
        print(head.next);
    }

    public Node middleNode(Node head){
        Node n1 = head;
        Node n2 = head;

        while(n2 != null && n2.next != null){
            n1 = n1.next;
            n2 = n2.next.next;
        }
        return n1;
    }

    public Node removeDuplicates(Node head) {
        Node current = head;
        Node prev = null;
        Hashtable ht = new Hashtable();

        while(current != null) {
            if(ht.containsKey(current.data)) {
                prev.next = current.next;
            }else {
                prev = current;
                ht.put(current.data, true);
            }
            current = current.next;
        }
        return head;
    }

    public Node removeDuplicates2(Node head) {
        Node n1 = head;
        Node prev, n2;

        while(n1 != null) {
            prev = n1;
            n2 = n1.next;
            while(n2 != null) {
                if(n2.data == n1.data) {
                    prev.next = n2.next;
                }else
                    prev = n2;
                n2 = n2.next;
            }
            n1 = n1.next;
        }
        return head;
    }

    public Node deleteNthToLastNode(Node head, int data){
        Node n1 = head;
        Node n2 = head;
        Node prev = null;

        for(int i=0; i<n2; i++)
            n2 = n2.next;

        while(n2 != null){
            prev = n1;
            n1 = n1.next;
            n2 = n2.next;
        }
        prev.next = n1.next;
    }

    public boolean isLoop(Node head){
        Node fast = head.next;
        Node slow = head;

        while(fast != null && fast.next != null){
            if(fast == slow)
                return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }

    public Node mergeTwoSortedLists(Node head1, Node head2){
        LinkedList list3 = new LinkedList();
        Node head3 = new Node();
        list3.head = head3;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                head3.next = head1;
                head1 = head1.next;
            }else{
                head3.next = head2;
                head2 = head2.next;
            }
            head3 = head3.next;
        }

        if(head1 != null)
            head3.next = head1;


        if(head2 != null)
            head3.next = head2;
        return list3.head;
    }

    public Node reverseLinkedList(Node head){
        Node next = null;
        Node current = head;
        Node prev = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public boolean isOddDuplicates(Node head){
        Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
        Node current = head;

        while(current != null){
            ht.put(current.data, ht.containsKey(current.data) ? ht.get(current.data)+1 : 1);
            current = current.next;
        }
        LinkedList list = new LinkedList();
        Set<Integer> keys = ht.keySet();

        for(int key: keys){
            if(ht.get(key) > 1)
                list.head = list.insert(list.head, ht.get(key));
        }

        if((length(list.head) % 2 )== 0)
            return false;
        return true;
    }
}
