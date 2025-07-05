package com.chicoo.be0920.module2.threads.ReadWriteLock;

import com.chicoo.be0920.module2.util.log;

import java.util.concurrent.locks.ReadWriteLock;

public class ReadWriteSharedResource {

    boolean isAvailable = false;

    //Consider mu code int his method is criticle and want to have a readlock .
    public void producer(ReadWriteLock readWriteLock) {
        try {
            readWriteLock.readLock().lock();
            log.info("Read Lock acquired by : " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(8000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            readWriteLock.readLock().unlock();
            log.info("Read Lock release by : " + Thread.currentThread().getName());
        }
    }

    //Consider mu code int his method is criticle and want to have a writelock .
    public void consumer(ReadWriteLock readWriteLock) {
        try {
            readWriteLock.writeLock().lock();
            log.info("Write Lock acquired by : " + Thread.currentThread().getName());
            isAvailable = false;
        } finally {
            readWriteLock.writeLock().unlock();
            log.info("Write Lock release by : " + Thread.currentThread().getName());
        }
    }
}
