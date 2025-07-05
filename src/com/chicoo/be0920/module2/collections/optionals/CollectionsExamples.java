package com.chicoo.be0920.module2.collections.optionals;

import com.chicoo.be0920.util.log;

import java.util.ArrayList;
import java.util.List;

public class CollectionsExamples {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        log.info("Size of the list :" + list.size());
        list.add(3);

        list.forEach((Integer i) -> {
            log.info("List items : " + i);
        });

        boolean isItemRemoved = list.remove(Integer.valueOf(3));
        log.info("Is Item Removed : " + isItemRemoved);

        list.forEach((Integer i) -> {
            log.info("List items after removal: " + i);
        });

        Object[] array = list.toArray();
        log.info("Array Length : " + array.length);
    }
}
