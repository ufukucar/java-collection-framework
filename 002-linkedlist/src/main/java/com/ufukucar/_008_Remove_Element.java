package com.ufukucar;

import java.util.LinkedList;

public class _008_Remove_Element {

    public static void main(String[] args) {


        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("Pink");
        list.add("orange");

        System.out.println("Original list: " + list);
        System.out.println("List size. " + list.size());

        System.out.println("*********************************************");


        System.out.println("Remove first element: " + list.pop());

        System.out.println("After pop operation: " + list);

        System.out.println("List size. " + list.size());
        System.out.println("*********************************************");




    }


}
