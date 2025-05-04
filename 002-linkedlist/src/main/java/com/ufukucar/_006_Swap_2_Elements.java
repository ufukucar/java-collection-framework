package com.ufukucar;

import java.util.Collections;
import java.util.LinkedList;

public class _006_Swap_2_Elements {


    public static void main (String [] args) {


        LinkedList list = new LinkedList();

        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Orange");

        System.out.println("Original list: " + list);

        System.out.println("List size: " + list.size());

        System.out.println("**************************************");

        System.out.println("Birinci ve ikinci eleman yer değiştiriyor...");
        Collections.swap(list, 0, 1);
        System.out.println("Original list: " + list);
        System.out.println("List2 size: " + list.size());
        System.out.println("**************************************");

















    }


}
