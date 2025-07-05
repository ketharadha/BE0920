package com.chicoo.be0920.module2.threads.customlocksinterthreadcomms;

import com.chicoo.be0920.module2.util.log;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerSharedResource {
    boolean isAvailable = false;

    public void producer(ReentrantLock reentrantLock, Condition condition) {
        try {
            reentrantLock.lock();
            log.info("Started " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(3000L);
            condition.signalAll();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            reentrantLock.unlock();
            log.info("Lock released by : " + Thread.currentThread().getName());
        }
    }

    public void consumer(ReentrantLock reentrantLock, Condition condition) {
        log.info("Started " + Thread.currentThread().getName());
        if(!isAvailable) {
            try {
                condition.await(); // Releases the object lock
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        log.info("Consumed the item");
        isAvailable = false;
    }
}
