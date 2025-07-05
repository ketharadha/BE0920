package com.chicoo.be0920.module2.threads.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteMainThread {
    public static void main(String[] args) {

        //Lock Instance
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        ReadWriteSharedResource sharedResource = new ReadWriteSharedResource();
        Thread t1 = new Thread(() -> {
            sharedResource.producer(readWriteLock);
        }, "ReadThread1");

        Thread t2 = new Thread(() -> {
            sharedResource.producer(readWriteLock);
        }, "ReadThread2");


        ReadWriteSharedResource sharedResource1 = new ReadWriteSharedResource();
        Thread t3 = new Thread(() -> {
            sharedResource1.consumer(readWriteLock);
        }, "WriteThread1");

        t1.start();
        t2.start();
        t3.start();
    }
}
