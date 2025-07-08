package com.chicoo.be0920.module2.collections.optionals;

import com.chicoo.be0920.module2.util.log;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> minHeapQueue = new PriorityQueue<>();
        minHeapQueue.add(5);
        minHeapQueue.add(1);
        minHeapQueue.add(3);
        minHeapQueue.add(8);
        minHeapQueue.add(2);

        Queue<Integer> maxHeapQueue = new PriorityQueue<>((Integer a, Integer b) -> b-a);
        maxHeapQueue.add(5);
        maxHeapQueue.add(1);
        maxHeapQueue.add(3);
        maxHeapQueue.add(8);
        maxHeapQueue.add(2);

       /* for (Integer item : queue) {
            log.info("Queue Item : " + item);
        }*/
        minHeapQueue.forEach((Integer i) -> log.info("Min Heap Queue Item : " + i));
        System.out.println();
        System.out.println();
        maxHeapQueue.forEach((Integer i) -> log.info("Max Heap Queue Item : " + i));
        System.out.println();
        System.out.println();
        minHeapQueue.offer(10);
        minHeapQueue.forEach((Integer i) -> log.info("Min Heap Queue Item After Offer : " + i));
        minHeapQueue.remove(1); //Removes from Front.
        minHeapQueue.forEach((Integer i) -> log.info("Min Heap Queue Item After Remove() : " + i));
    }
}
