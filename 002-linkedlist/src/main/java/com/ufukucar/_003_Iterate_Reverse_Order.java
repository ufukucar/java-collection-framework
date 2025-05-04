package com.ufukucar;

import java.util.Iterator;
import java.util.LinkedList;

public class _003_Iterate_Reverse_Order {


    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Mercedes");
        list.add("Toyota");
        list.add("BMW");
        list.add("Ford");
        list.add("Tesla");
        list.add("Suzuki");
        list.add("Volkswagen");
        list.add("Fiat");


        System.out.println("Original list: " + list);

        System.out.println("**************************************");

        System.out.println("Reverse Order: " + list.reversed());

        System.out.println("**************************************");

        Iterator iterator = list.descendingIterator();

        while(iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }

        System.out.println("\n**************************************");






    }



}
