package com.chicoo.be0920.module2.threads.SemaphoreLock;

import java.util.concurrent.Semaphore;

public class SemaphoreMainThread {

    public static void main(String[] args) {
        SemaphoreSharedResource sharedResource = new SemaphoreSharedResource();
        Semaphore semaphore = new Semaphore(2);

        Thread t1 = new Thread(() -> {
            sharedResource.producer(semaphore);
        }, "Thread1");

        Thread t2 = new Thread(() -> {
            sharedResource.producer(semaphore);
        }, "Thread2");

        Thread t3 = new Thread(() -> {
            sharedResource.producer(semaphore);
        }, "Thread3");

        Thread t4 = new Thread(() -> {
            sharedResource.producer(semaphore);
        }, "Thread4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
