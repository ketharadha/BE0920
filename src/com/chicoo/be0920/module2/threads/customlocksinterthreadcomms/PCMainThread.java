package com.chicoo.be0920.module2.threads.customlocksinterthreadcomms;

import com.chicoo.be0920.module2.util.log;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PCMainThread {
    public static void main(String[] args) {
        ProducerConsumerSharedResource pcSharedResource = new ProducerConsumerSharedResource();
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition condition = reentrantLock.newCondition();

        Thread producerThread = new Thread(() -> {
            log.info("Executing Producer method");
            pcSharedResource.producer(reentrantLock, condition);
        }, "Producer");

        Thread consumerThread = new Thread(() -> {
            log.info("Executing Consumer method");
            pcSharedResource.consumer(reentrantLock, condition);
        }, "Consumer");

        producerThread.start();
        consumerThread.start();

        log.info("Main thread Completed");
    }
}
