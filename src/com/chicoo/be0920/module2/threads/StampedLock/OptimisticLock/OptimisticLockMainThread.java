package com.chicoo.be0920.module2.threads.StampedLock.OptimisticLock;

import com.chicoo.be0920.module2.threads.StampedLock.PessimisticSharedResource;

import java.util.concurrent.locks.StampedLock;
import java.util.function.Function;

public class OptimisticLockMainThread {
    public static void main(String[] args) {

        //Lock Instance
        StampedLock stampedLock = new StampedLock();

        OptimisticSharedResource sharedResource = new OptimisticSharedResource();
        Thread t1 = new Thread(() -> {
            sharedResource.producer(stampedLock);
        }, "ReadThread1");

        PessimisticSharedResource sharedResource1 = new PessimisticSharedResource();
        Thread t2 = new Thread(() -> {
            sharedResource1.consumer(stampedLock);
        }, "WriteThread1");
        
        t1.start();
        //t2.start();
    }
}
