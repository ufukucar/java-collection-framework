package com.ufukucar;

import java.util.LinkedList;

public class _009_Retrieve_But_Not_Remove {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Green");
        list.add("Blue");
        list.add("Orange");
        list.add("White");

        System.out.println("Original list: " + list);
        System.out.println("*********************************************");

        String first = list.peekFirst();
        System.out.println("First element: " + first);

        System.out.println("After peek first element: " + list);
        System.out.println("*********************************************");

        String last = list.peekLast();
        System.out.println("Last element: " + last);

        System.out.println("After peek last element: " + list);
        System.out.println("*********************************************");


    }


}
