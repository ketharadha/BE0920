package com.chicoo.be0920.module2.threads.interthreadcomms;

import com.chicoo.be0920.module2.util.log;

public class PCMainThread {
    public static void main(String[] args) {
        ProducerConsumerSharedResource pcSharedResource = new ProducerConsumerSharedResource();

        Thread producerThread = new Thread(() -> {
            log.info("Executing Producer method");
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            pcSharedResource.producer();
        }, "Producer");

        Thread consumerThread = new Thread(() -> {
            log.info("Executing Consumer method");
            pcSharedResource.consumer();
        }, "Consumer");

        producerThread.start();
        consumerThread.start();

        log.info("Main thread Completed");
    }
}
