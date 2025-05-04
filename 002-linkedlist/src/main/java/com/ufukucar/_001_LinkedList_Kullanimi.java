package com.ufukucar;

import java.util.LinkedList;
import java.util.List;

public class _001_LinkedList_Kullanimi {
    public static void main(String[] args) {


        List<String> list = new LinkedList<>();

        list.add("Mercedes");
        list.add("BMW");
        list.add("Ford");
        list.add("Honda");

        System.out.println(list);

        System.out.println("****************************");

        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("****************************");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element index: " + i + " is " + list.get(i));
        }

        System.out.println("****************************");

        System.out.println(list.contains("Mercedes"));
        System.out.println(list.contains("Toyota"));

        System.out.println("****************************");

        list.remove("Mercedes");
        System.out.println(list);

        System.out.println("****************************");

        System.out.println(list.get(0));
        System.out.println(list.getFirst());

        System.out.println("****************************");

        System.out.println("Remove the first element of the list");
        list.removeFirst();
        System.out.println(list);

        System.out.println("****************************");

        System.out.println("Remove the last element of the list");
        list.removeLast();
        System.out.println(list);
        System.out.println("****************************");

        System.out.println("Remove all elements of the list");

        list.clear();

        System.out.println(list);
        System.out.println("****************************");




    }
}