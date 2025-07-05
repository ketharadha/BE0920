package com.chicoo.be0920.module2.threads.interthreadcomms;

import com.chicoo.be0920.module2.util.log;

public class ProducerConsumerSharedResource {
    boolean isAvailable = false;

    public synchronized void producer() {
        log.info("Started " + Thread.currentThread().getName());
        isAvailable = true;
        notifyAll(); // Releases the lock
    }

    public synchronized void consumer() {
        log.info("Started " + Thread.currentThread().getName());
        if(!isAvailable) {
            try {
                wait(); // Releases the object lock
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        log.info("Consumed the item");
        isAvailable = false;
    }
}
