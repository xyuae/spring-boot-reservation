package com.lynda.javatraining.olives;

/**
 * Created by Xiaojun YU on 2017-09-26.
 */
public enum OliveColor {
    BLACK("Black"), GREEN("Green"), GOLDEN("Golden");

    private String colorAsString;

    private OliveColor(String colorAsString) {
        this.colorAsString = colorAsString;
    }

    @Override
    public String toString() {
        return this.colorAsString;
    }
}
