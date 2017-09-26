package com.lynda.javatraining.olives;

/**
 * Created by Xiaojun YU on 2017-09-25.
 */
public class Olive implements Comparable<Olive> {
    public OliveName oliveName;
    public OliveColor color;

    public Olive(OliveName oliveName, OliveColor color) {
        this.oliveName = oliveName;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.oliveName.toString();
    }

    @Override
    public int compareTo(Olive o) {
        String s1 = this.getClass().getSimpleName();
        String s2 = o.getClass().getSimpleName();
        return s1.compareTo(s2);
    }
}
