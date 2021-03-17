package com.st.test;

/**
 * Created by admin on 2017/1/22.
 */
public class mytest {
    public static void main(String [] args){
        new Thread(new Worker()).start();
        new Thread(new Worker()).start();
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
