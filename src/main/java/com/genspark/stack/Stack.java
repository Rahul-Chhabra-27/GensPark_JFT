package com.genspark.stack;

public class Stack {
    private LinkedList ds;

    public Stack() {
        ds = new LinkedList();
    }

    // 1. Push
    void push(int value) {
        ds.addElementToTheHeadOfLinkedList(value);
    }
    // 2. Peek
    int peek() {
        return ds.headOfTheLinkedList();
    }
    // 3. isEmpty
    boolean isEmpty() {
        return ds.isEmpty();
    }
    // 4. pop
    void pop() {
        ds.shiftToNext();
    }
}
