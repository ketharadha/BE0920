package com.chicoo.be0920.module2.collections;

import com.chicoo.be0920.module2.oops.abstraction.abstractclass.Car;
import com.chicoo.be0920.module2.oops.abstraction.abstractclass.Tesla;
import com.chicoo.be0920.module2.util.log;

import java.util.*;

public class CollectionsIterable {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>(); //Will discuss about Generics later.
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");
        strList.add("e");

        Iterator<String> iterator = strList.listIterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            log.info("Element 1 : " + element);

            if (element.equals("c")) {
                iterator.remove();
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for(String str : strList) { //Enhanced for loop
            log.info("Element 2 : " + str);
        }

        List<String> sameStrList = strList;

        List<String> notSameStrList = new ArrayList<>();
        notSameStrList.add("p");
        notSameStrList.add("q");
        notSameStrList.add("r");
        notSameStrList.add("s");
        notSameStrList.add("t");

        for(String str : notSameStrList) { //Enhanced for loop
            log.info("Combined Elements Before : " + str+ " : " + notSameStrList.indexOf(str));
        }

        List<String> combinedStrList = new ArrayList<>();
        notSameStrList.addAll(3, strList);

        System.out.println();
        System.out.println();
        System.out.println();
        for(String str : notSameStrList) { //Enhanced for loop
            log.info("Combined Elements : " + str + " : " + notSameStrList.indexOf(str));
        }

        notSameStrList.removeAll(strList);

        for(String str : notSameStrList) { //Enhanced for loop
            log.info("Remove All Elements : " + str + " : " + notSameStrList.indexOf(str));
        }

        if (strList.equals(sameStrList)) {
            log.info("Two lists are equal");
        }
    }
}
