package com.ufukucar;

import java.util.LinkedList;

public class _004_Insert_Element {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();


        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");

        System.out.println("Original list: " + list);
        System.out.println("List size: " + list.size());

        System.out.println("**************************************");

        System.out.println("Yellow color added after the red color: ");

        list.add(1, "Yellow");

        System.out.println(list);
        System.out.println("List size: " + list.size());

        System.out.println("**************************************");

        System.out.println("Add element in front of the list");

        list.offerFirst("Yellow");
        System.out.println(list);
        System.out.println("List size: " + list.size());
        System.out.println("**************************************");

        System.out.println("Add element at the end of the list");

        list.offerLast("Yellow");
        System.out.println(list);
        System.out.println("List size: " + list.size());
        System.out.println("**************************************");


    }


}
