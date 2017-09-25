package com.xyuae.threads.Ch01;

/**
 * Created by Xiaojun YU on 2017-09-22.
 */
public class Threads_01_03 {
    public static void main(String[] args) throws InterruptedException {
        // print information about hte current thread
        System.out.printf("%s is %salive and in %s " +
                "state%n and priority %d \n", Thread.currentThread().getName(),
                Thread.currentThread().isAlive() ? "" : "not ",
                Thread.currentThread().getState(),
                Thread.currentThread().getPriority()
        );  // System.out.printf
        // Create a runnable object that prints information about the thread
        Runnable r1 = () ->{
            //Thread thd = Thread.currentThread();
            System.out.printf("%s is %salive and in %s " +
                            "state%n and priority %d \n", Thread.currentThread().getName(),
                    Thread.currentThread().isAlive() ? "" : "not ",
                    Thread.currentThread().getState(),
                    Thread.currentThread().getPriority()
            );  // System.out.printf
        };   // Runnable r1 = () =>
        Thread t1 = new Thread(r1, "Thread t1");
        System.out.printf("%s is %salive and in %s " +
                        "state%n and priority %d \n", t1.getName(),
                t1.isAlive() ? "" : "not ",
                t1.getState(),
                t1.getPriority()
        );  // System.out.printf

        t1.start();
        Thread t2 = new Thread(r1);
        t2.start();
        // put main thread to sleep for 2 seconds
        Thread.sleep(2000);

        t2.setName("Thread t2");
        Thread.activeCount();
    }
}
