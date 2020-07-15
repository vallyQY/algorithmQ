package com.xzkingdee.thread;

/**
 * @author qy
 * @date Created in 2020/7/9
 **/
public class MyThread implements Runnable {
    private static final Integer TEN = 10;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        String info = Thread.currentThread().toString();
        long idNum = Thread.currentThread().getId();
        for (int i = 0; i < TEN; i++) {
            System.out.println(String.format("Thread A(name:%s,id:%s,info:%s)", name, idNum, info));
        }
    }
}
