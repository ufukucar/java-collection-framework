package com.ufukucar;

import java.util.List;
import java.util.Vector;

public class _001_Vector_Nedir {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);

        System.out.println("Vector elements: " + vector);

        System.out.println("*************************************************");

        System.out.println("List interface ini import eder:");

        List<Integer> vector2 = new Vector<>();
        vector2.add(1);
        vector2.add(2);
        vector2.add(3);
        vector2.add(4);
        vector2.add(5);
        vector2.add(6);

        System.out.println("Vector elements: " + vector2);
        System.out.println("*************************************************");

        System.out.println(vector.contains(1));


    }
}