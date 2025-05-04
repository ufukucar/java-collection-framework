package com.ufukucar;

import java.util.LinkedList;

public class _008_Clone {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("Pink");
        list.add("orange");

        System.out.println("Original list: " + list);

        System.out.println("********************************************");

        LinkedList<String> list2 = new LinkedList<>();

        list2 = (LinkedList) list.clone();

        System.out.println("Cloned list: " + list2);


    }


}
