package com.xyuae.threads.Ch01;

/**
 * Created by Xiaojun YU on 2017-09-22.
 */
public class HellowRunnable implements Runnable {
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName()+ " "
                + "a thread created by "
                + "implementing a Runnable Interface"
        );   // System.out.println
    }   // run()
}   // HellowRunnable
