package com.genspark.stack;

public class LinkedList {
    private ListNode head;

    // 1. Checking if the linked list is empty or not
    boolean isEmpty() {
        return head == null;
    }
    // 2. Return the head of the linked list
    int headOfTheLinkedList() {
        if(this.isEmpty()) {
            return -1;
        }
        else {
            return head.getData();
        }
    }
    // 3. Add the element to the head of the linkedList.
    void addElementToTheHeadOfLinkedList(int value) {
        ListNode newNode = new ListNode(value,null);

        if(this.isEmpty()) {
            head = newNode;
        }
        else {
            newNode.setNext(head);
            head = newNode;
        }
    }
    // 4. Shift the head of the LinkedList to the next(right)
    void shiftToNext() {
        if (isEmpty()) return;
        head = head.getNext();
    }
}
