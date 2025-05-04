package com.ufukucar;

import java.util.LinkedList;

public class _005_Insert_Another_LinkedList {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();


        list.add("Red");
        list.add("Green");
        list.add("Black");

        System.out.println("Original list: " + list);
        System.out.println("List size: " + list.size());

        System.out.println("**************************************");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("White");
        list2.add("Blue");

        System.out.println("Original list2: " + list2);
        System.out.println("List2 size: " + list2.size());

        System.out.println("**************************************");

        System.out.println("Add the collection in the second position of the existing linked list");

        list.addAll(1, list2);

        System.out.println("Original list: " + list);
        System.out.println("List size: " + list.size());

        System.out.println("**************************************");

    }


}
