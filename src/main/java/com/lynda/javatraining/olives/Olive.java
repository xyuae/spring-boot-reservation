package com.lynda.javatraining.olives;

/**
 * Created by Xiaojun YU on 2017-09-25.
 */
public class Olive {
    public OliveName oliveName;
    public long color;

    public Olive(OliveName oliveName, long color) {
        this.oliveName = oliveName;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.oliveName.toString();
    }
}
