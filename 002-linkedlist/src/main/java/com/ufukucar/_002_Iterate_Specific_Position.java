package com.ufukucar;

import java.util.Iterator;
import java.util.LinkedList;

public class _002_Iterate_Specific_Position {

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

        System.out.println(list);

        System.out.println("***********************************");

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }

        System.out.println("\n***********************************");

        Iterator iterator2 = list.listIterator(2);

        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + ", ");
        }

        System.out.println("\n***********************************");


    }



}
