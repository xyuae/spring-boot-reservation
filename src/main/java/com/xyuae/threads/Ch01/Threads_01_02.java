package com.xyuae.threads.Ch01;

/**
 * Created by Xiaojun YU on 2017-09-22.
 */
public class Threads_01_02 {
    public static void main(String[] args) {
        // Create a thread using a class that implements runnable
        (new Thread(new HellowRunnable())).start();

        //Create a thread using a class that extends Thread
        (new HelloThread()).start();
        //Create a runnable object
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                //perform some work  inside the thread
                System.out.println("Hello from " +
                    Thread.currentThread().getName()
                    + " Not using lambda");
            }   // run()
        };  // Runnable r1 = new Runnable()
        // Create a runnable object using lambda notation
        Runnable r2 = () -> System.out.println("Hello from "
            + Thread.currentThread().getName() + " Using LAMBDA " + "notation"
        );  // Runnable r2 = () ->
        /*
         * Create and start a thread using hte first runnable object
         * This thread is also given a name in the arguments
         */
        Thread t1 = new Thread(r1, "Thread t1");
        t1.start();
        Thread t2 = new Thread(r2);
        //t2.getState();
        t2.start();
    }
}
