package com.chicoo.be0920.module2.threads.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantMainThread {
    public static void main(String[] args) {
        ReentrantSharedResource sharedResource = new ReentrantSharedResource();
        ReentrantLock reentrantLock = new ReentrantLock();

        Thread t1 = new Thread(() -> {
           sharedResource.producer(reentrantLock);
        }, "Thread1");

        Thread t2 = new Thread(() -> {
           sharedResource.producer(reentrantLock);
        }, "Thread2");

        t1.start();
        t2.start();
    }
}
