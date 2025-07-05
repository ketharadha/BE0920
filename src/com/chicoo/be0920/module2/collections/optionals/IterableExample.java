package com.chicoo.be0920.module2.collections.optionals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //Iterating over an Iterable <- List using Iterator.
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            System.out.println("List Item : " + value);
            if (value == 3) {
                iterator.remove();
            }
        }

        //Iterating over an Iterable <- List using forEach loop.
        for (int item : list) {
            System.out.println("List of items after removed " + item);
        }

        list.forEach((Integer item) -> {
            System.out.println("For Each Lambda " + item);
        });
    }
}
