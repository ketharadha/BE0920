package com.chicoo.be0920.module2.collections;

import com.chicoo.be0920.module2.util.log;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(21, "B");
        map.put(23, "C");
        map.put(141, "D");
        map.put(25, "E");
        map.forEach((Integer key, String value) -> System.out.println(key +" : " + value));
        System.out.println();
        System.out.println();


        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(1, "A");
        map1.put(21, "B");
        map1.put(23, "C");
        map1.put(141, "D");
        map1.put(25, "E");
        map1.forEach((Integer key, String value) -> System.out.println(key +" : " + value));
        System.out.println();
        System.out.println();
        //Access order
        Map<Integer, String> map2 = new LinkedHashMap<>(16, .75F, true);
        map2.put(1, "A");
        map2.put(21, "B");
        map2.put(23, "C");
        map2.put(141, "D");
        map2.put(25, "E");
        map2.forEach((Integer key, String value) -> System.out.println(key +" : " + value));
        System.out.println("Accessing... " + map2.get(23));
        map2.get(23);
        map2.forEach((Integer key, String value) -> System.out.println(key +" : " + value));

        //By Default LinkedHashMap is not Threadsafe and throws ConcurrentModificationException when two threads trying to access same Collection.
        //We need to make it threadsafe
        Map<Integer, String> threadSafeMap = Collections.synchronizedMap(new LinkedHashMap<>());
    }
}
