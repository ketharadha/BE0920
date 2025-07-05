package com.chicoo.be0920.module2.threads.StampedLock;

import com.chicoo.be0920.module2.util.log;

import java.util.concurrent.locks.StampedLock;

public class PessimisticSharedResource {

    boolean isAvailable = false;

    //Consider mu code int his method is criticle and want to have a readlock .
    public void producer(StampedLock readWriteLock) {
        long stamp = readWriteLock.readLock();
        try {
            log.info("Read Lock acquired by : " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(8000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            readWriteLock.unlockRead(stamp);
            log.info("Read Lock release by : " + Thread.currentThread().getName());
        }
    }

    //Consider mu code int his method is criticle and want to have a writelock .
    public void consumer(StampedLock readWriteLock) {
        long stamp = readWriteLock.writeLock();
        try {
            log.info("Write Lock acquired by : " + Thread.currentThread().getName());
            isAvailable = false;
        } finally {
            readWriteLock.unlockWrite(stamp);
            log.info("Write Lock release by : " + Thread.currentThread().getName());
        }
    }
}
