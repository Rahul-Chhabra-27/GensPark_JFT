package com.genspark.LL;

public class Main {

    public static void main(String[] args) {

        LinkedList myLL = new LinkedList();
        myLL.addListNodeToTheEndOfLinkedList(5);
        myLL.addListNodeToTheEndOfLinkedList(10);
        myLL.addListNodeToTheEndOfLinkedList(20);
        myLL.addListNodeToTheEndOfLinkedList(30);
        myLL.addListNodeToTheEndOfLinkedList(40);
        myLL.addListNodeToTheEndOfLinkedList(50);
        myLL.traverseTheLinkedList();
        int ans = myLL.countNodesofLinkedList();
        System.out.print(ans);

        System.out.println("--------------------");

        myLL.deleteTheLastListNode();
        myLL.traverseTheLinkedList();
        System.out.println(myLL.countNodesofLinkedList());
    }
}
