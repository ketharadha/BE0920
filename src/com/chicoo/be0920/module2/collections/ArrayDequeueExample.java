package com.chicoo.be0920.module2.collections;

import com.chicoo.be0920.module2.util.log;

import java.util.ArrayDeque;

public class ArrayDequeueExample {
    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDequeAsQueue = new ArrayDeque<>();

//Insertion
        arrayDequeAsQueue.addLast(1);
        arrayDequeAsQueue.addLast(5);
        arrayDequeAsQueue.addLast(10);

//Deletion
        int element = arrayDequeAsQueue.removeFirst();
        log.info("Deletion : " + element);

//LIFO (last in first out)
        ArrayDeque<Integer> arrayDequeAsStack = new ArrayDeque<>();
        arrayDequeAsStack.addFirst(1);
        arrayDequeAsStack.addFirst(5);
        arrayDequeAsStack.addFirst(10);

//Deletion
        int removedElem = arrayDequeAsStack.removeFirst();
        System.out.println(removedElem);

    }
}
