package com.genspark.LL;

public class LinkedList {
    private ListNode head;

    // First function....
    void addListNodeToTheEndOfLinkedList(int value) {

        //step 1. Create the () -> ListNode and assign the value 40
        ListNode newNode = new ListNode(value,null);


        // if LL is empty
//      how to identify LL is empty or not.

        if(head == null) {
            head = newNode;
            return;
        }

        //step 2. link it to the last node of the existing linkedlist.
        ListNode temp = head;
        // we can identify the last node by looking at the next
        // attribute , if it contains null => lastNode.
        // next of some node ==> null => lastNode.
        // next of some node doesn't contain ==> intermediate node | first node.
        while(temp.getNext() != null) {
            temp = temp.getNext();
        }

        // we are standing on the last node by using temp
        temp.setNext(newNode);
        newNode.setNext(null);
    }
    void traverseTheLinkedList() {
        ListNode temp = head;
        // Iterate every node one by one and after reaching to
        // the last node the temp will point to the null.
        while(temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }

        // we have traversed the entire ll and my temp is now
        // pointing to the null[which comes after the last nodes].

    }
    public int countNodesofLinkedList() {
        // we have seen that we can traverse through while.
        // traverse through for loop.

        int countNodes = 0;

        for(ListNode temp = head; temp != null; temp = temp.getNext()) {
            countNodes++;
        }

        return countNodes;
    }

    void deleteTheLastListNode() {
        if(head == null) {
            return;
        }
        if(head.getNext() == null) {
            head = null;
            return;
        }
        ListNode temp1 = head;
        ListNode temp2 = null;
        // run the loop until temp1 reaches the last node.
        while(temp1.getNext() != null) {
            temp2 = temp1;
            temp1 = temp1.getNext();
        }
        // At this point temp1 ==> last node
         //                temp2 ==> secondlast node
        // breaking the chain
        temp2.setNext(null);
    }

    void deleteTheNodeAtKthPosition(int k) {

          if(k == 0) {
              head = head.getNext();
              return;
          }
//        k is the index on the node[delete]
          ListNode temp1 = head;
          ListNode temp2 = null;

          for(int i = 0; i <= k ; i++) {
                temp2 = temp1;
                temp1 = temp1.getNext();
          }
          // temp1 is point at the node[delete].
         // temp2 io at k-1th position.
          ListNode addressOFNextToNextNode = temp1.getNext();
          temp2.setNext(null); // doing nothing...
          temp2.setNext(addressOFNextToNextNode);
    }
}
