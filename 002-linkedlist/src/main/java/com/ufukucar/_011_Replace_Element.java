package com.ufukucar;

import java.util.LinkedList;

public class _011_Replace_Element {


    public static void main (String [] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Yellow");
        list.add("Orange");
        list.add("Pink");

        System.out.println("Original List: " + list);

        System.out.println("*********************************************");

        System.out.println("Birinci eleman White yapılacak");

        list.set(0, "White");

        System.out.println("Yeni liste: " + list);

        System.out.println("*********************************************");








    }


}
