package com.lynda.javatraining;

import com.lynda.javatraining.olives.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Xiaojun YU on 2017-09-25.
 */
public class Main {
    public static void main(String[] args) {


        Olive lig = new Ligurio();
        Olive kal = new Kalamata();
        Olive pic = new Picholine();

        TreeSet<Olive> set = new TreeSet<>();

        try {
            set.add(pic);
            set.add(kal);
            set.add(lig);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(set);



        /* HashSet
        HashSet<Olive> set = new HashSet<>();
        set.add(lig);
        set.add(kal);
        System.out.println("There are " + set.size() + " olives in the set.");

        set.add(pic);
        System.out.println("There are " + set.size() + " olives in the set.");
        */

        /*
        Object o = new Ligurio();

        Class<?> c = o.getClass();
        System.out.println("Class name " + c.getName());

        Class<?> sup = c.getSuperclass();
        System.out.println("Super name" + sup.getName());

        Class<?> top = sup.getSuperclass();


        Package p = c.getPackage();
        System.out.println("Package: " + p.getName());
        */
        /*
        Olive o = new Olive(OliveName.PICHOLINE, OliveColor.BLACK);
        Class<?> c = o.getClass();

        System.out.println(c);
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());

        Constructor<?>[] constructors = c.getConstructors();
        System.out.println("Number of constructors: " + constructors.length);
        Constructor<?> con = constructors[0];

        Object obj = null;

        try {
            obj = con.newInstance(OliveName.PICHOLINE, OliveColor.BLACK);
            System.out.println(obj);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        */

    }   // main
}
