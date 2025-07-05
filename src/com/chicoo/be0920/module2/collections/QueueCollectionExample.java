package com.chicoo.be0920.module2.collections;

import com.chicoo.be0920.module2.util.log;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollectionExample {
    public static void main(String[] args) {
        Queue<Integer> minHeapQueue = new PriorityQueue<>(); // Natural ordering
        minHeapQueue.add(5);
        minHeapQueue.add(1);
        minHeapQueue.add(3);
        minHeapQueue.add(8);
        minHeapQueue.add(2);
        minHeapQueue.add(2);

        minHeapQueue.forEach((Integer item) -> log.info("Min Heap Items : " + item));

        System.out.println();
        System.out.println();
        Queue<Integer> maxHeapQueue = new PriorityQueue<>((Integer a, Integer b) -> b-a);//Ordering is decided by Comparator
        maxHeapQueue.add(5);
        maxHeapQueue.add(1);
        maxHeapQueue.add(3);
        maxHeapQueue.add(8);
        maxHeapQueue.add(2);
        maxHeapQueue.add(2);

        maxHeapQueue.forEach((Integer item) -> log.info("Min Heap Items : " + item));

        System.out.println();
        System.out.println();
        minHeapQueue.remove();
        minHeapQueue.forEach((Integer item) -> log.info("Min Heap Items After remove() : " + item));

        System.out.println();
        System.out.println();
        maxHeapQueue.remove();
        maxHeapQueue.forEach((Integer item) -> log.info("Max Heap Items After remove() : " + item));
    }
}
