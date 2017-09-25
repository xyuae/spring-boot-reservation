package com.xyuae.threads.Ch01.threads_01_04;

/**
 * Created by Xiaojun YU on 2017-09-22.
 */
public class TestJoinClass extends Thread {
    public TestJoinClass(String name)
    {
        super(name);
    }
    public void run() {
        for(int i=1; i<=5; i++) {
            try {
                // stop the thread for 1/2 second
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " i = " + i);
        }   // for
    }   // run()
}   // class TestJoinClass
