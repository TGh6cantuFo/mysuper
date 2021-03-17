package com.st.test;

/**
 * Created by admin on 2017/1/22.
 */
public class Worker implements  Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
