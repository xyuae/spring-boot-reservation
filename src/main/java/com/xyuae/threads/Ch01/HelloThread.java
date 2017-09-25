package com.xyuae.threads.Ch01;

/**
 * Created by Xiaojun YU on 2017-09-22.
 */
public class HelloThread extends Thread {
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName()
                + " created by "
                + " extending Thread class!");
    }
}
