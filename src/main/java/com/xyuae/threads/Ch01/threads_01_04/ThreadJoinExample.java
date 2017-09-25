package com.xyuae.threads.Ch01.threads_01_04;

/**
 * Created by Xiaojun YU on 2017-09-22.
 */
public class ThreadJoinExample {
    public static void main(String[] args) {
        TestJoinClass t1 = new TestJoinClass("t1");
        TestJoinClass t2 = new TestJoinClass("t2");
        TestJoinClass t3 = new TestJoinClass("t3");
        t1.start();
        try{
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // thread t3 won;t start until thread 2 is complete
        t3.start();
    }




}
