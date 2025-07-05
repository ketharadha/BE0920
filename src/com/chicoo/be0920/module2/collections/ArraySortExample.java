package com.chicoo.be0920.module2.collections;

import com.chicoo.be0920.module2.util.log;

import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class ArraySortExample  {
    public static void main(String[] args) {
        Integer[] array = {2,5,1,4,3};
        Arrays.sort(array); //Can only do increasing order. What if I want to do it in decreasing order.

        for (int i: array) {
            log.info("int Items after sort : " + i);
        }

        System.out.println();
        System.out.println();

        Order[] order = new Order[4];
        order[0] = new Order(3, "HarddiskB");
        order[1] = new Order(1, "HarddiskD");
        order[2] = new Order(4, "HarddiskA");
        order[3] = new Order(2, "HarddiskC");

        Arrays.sort(order, (Order obj1, Order obj2) -> obj2.orderDescription.compareTo(obj1.orderDescription));
        for (Order i: order) {
            log.info("Order Items after sort : " + i.orderId + " : " + i.orderDescription );
        }

        System.out.println();
        System.out.println();

        Arrays.sort(order, (Order ord1, Order ord2) -> ord2.orderId.compareTo(ord1.orderId));
        for (Order i: order) {
            log.info("Order Items after sort : " + i.orderId + " : " + i.orderDescription );
        }

        //PriorityBlockingQueue
        //ConcurrentLinkedDeque
    }
}
