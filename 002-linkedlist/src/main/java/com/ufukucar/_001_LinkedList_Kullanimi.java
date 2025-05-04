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

        System.out.println(list.contains("Mercedes"));
        System.out.println(list.contains("Toyota"));

        System.out.println("****************************");

        list.remove("Mercedes");
        System.out.println(list);

        System.out.println("****************************");

        System.out.println(list.get(0));
        System.out.println(list.getFirst());



    }
}