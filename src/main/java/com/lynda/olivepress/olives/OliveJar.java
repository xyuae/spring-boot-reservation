package com.lynda.olivepress.olives;

import java.util.ArrayList;

/**
 * Created by Xiaojun YU on 2017-09-22.
 */
public class OliveJar {
    public static ArrayList<Olive> olives;
    {
        olives = new ArrayList<>();
        olives.add(new Olive("Kalamata", Olive.BLACK));

    }

    public void addOlive(String oliveName, long color) {
        olives.add(new Olive(oliveName, color));
    }

    public void reportOlives() {
        for (Olive o: olives) {
            System.out.println("it's a " + o.oliveName + " olive!");
        }
    }
    class Olive {

        public static final long BLACK = 0x000000;
        public String oliveName;
        public long color = BLACK;

        public Olive() {

        }

        public Olive(String oliveName) {
            this.oliveName = oliveName;
        }

        public Olive(String oliveName, long color) {
            this(oliveName);
            this.color = (color);
        }

        public String toString() {
            return "name: " + this.oliveName + ": " + "color: " + this.color;
        }

    }
}
