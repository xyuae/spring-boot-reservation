package com.lynda.javatraining;

import com.lynda.olivepress.olives.OliveJar;

import java.util.ArrayList;

/**
 * Created by Xiaojun YU on 2017-09-22.
 */
public class StaticInit {
    public static void main(String[] args) throws Exception {
        OliveJar jar = new OliveJar();
        jar.addOlive("Kalamata", 0x0000000);
        jar.reportOlives();
    }
}
