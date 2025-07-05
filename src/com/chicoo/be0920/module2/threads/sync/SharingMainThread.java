package com.chicoo.be0920.module2.threads.sync;

import com.chicoo.be0920.module2.util.log;

public class SharingMainThread {

    //wait()
    //notify()
    //notifyAll()
    public synchronized void task1() {
        log.info("Executing Task1");
        try {
            Thread.sleep(3000L);
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("Executing Task1 Finished execution - Lock will be release now");
    }

    public synchronized void task2() {
        log.info("Executing Task2");
        synchronized (this) {
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            log.info("Task2 inside Synchronized block");
        }
    }

    public synchronized void task3() {
        log.info("Executing Task3");
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("Task3 Finished");
    }
}
