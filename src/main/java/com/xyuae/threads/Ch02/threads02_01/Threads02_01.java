package com.xyuae.threads.Ch02.threads02_01;

/**
 * Created by Xiaojun YU on 2017-09-22.
 */
public class Threads02_01 {
    static double a = 10;
    static double b;
    public static void main(String[] args) {
        Runnable r1 = () ->
        {
            if (a == 10){
                try {
                    Thread.sleep(0);
                    b = a/2.0;
                    System.out.println(Thread.currentThread().getName() + ": " + b);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }   // if
        };   // Runnable r1
        Runnable r2 = () -> {
            a = 12;
        };  // Runnable r2
        Thread thdA = new Thread(r1, "Thread A");
        Thread thdB = new Thread(r2, "Thread B");
        thdA.start();
        thdB.start();
    }
}
