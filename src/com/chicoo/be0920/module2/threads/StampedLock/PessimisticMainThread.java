package com.chicoo.be0920.module2.threads.StampedLock;

import java.util.concurrent.locks.StampedLock;

//StampedLock - ReadWriteLock
public class PessimisticMainThread {
    public static void main(String[] args) {

        //Lock Instance
        StampedLock readWriteLock = new StampedLock();

        PessimisticSharedResource sharedResource = new PessimisticSharedResource();
        Thread t1 = new Thread(() -> {
            sharedResource.producer(readWriteLock);
        }, "ReadThread1");

        Thread t2 = new Thread(() -> {
            sharedResource.producer(readWriteLock);
        }, "ReadThread2");


        PessimisticSharedResource sharedResource1 = new PessimisticSharedResource();
        Thread t3 = new Thread(() -> {
            sharedResource1.consumer(readWriteLock);
        }, "WriteThread1");

        t1.start();
        t2.start();
        t3.start();
    }
}
