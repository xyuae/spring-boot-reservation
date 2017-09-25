package com.lynda.javatraining.olives;

/**
 * Created by Xiaojun YU on 2017-09-25.
 */
public enum OliveName {
    KALAMATA("Kalamata"), LIGURIO("Ligurio"), PICHOLINE("Picholine"), GOLDEN("Golden");

    private String nameAsString;

    OliveName(String nameAsString) {
        this.nameAsString = nameAsString;
    }

    @Override
    public String toString() {
        return this.nameAsString;
    }
}
