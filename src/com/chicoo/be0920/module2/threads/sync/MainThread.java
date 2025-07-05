package com.chicoo.be0920.module2.threads.sync;

import com.chicoo.be0920.module2.util.log;

public class MainThread {
    public static void main(String[] args) {
        SharingMainThread sm = new SharingMainThread();
        Thread t1 = new Thread(() -> {
            sm.task1();
        });

        Thread t2 = new Thread(() -> {
            sm.task2();
        });

        Thread t3 = new Thread(() -> {
            sm.task3();
        });

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //Other thread dependent functionalities that need to be executed only after above thread execution completed.

        log.info("Main thread finished");
    }
}
