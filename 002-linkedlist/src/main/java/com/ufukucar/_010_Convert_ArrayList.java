package com.ufukucar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _010_Convert_ArrayList {
    
    public static void main(String[] args) {
        
        LinkedList<String> linked_list = new LinkedList<>();

        linked_list.add("Red");
        linked_list.add("Green");
        linked_list.add("Blue");
        linked_list.add("White");
        linked_list.add("Black");

        System.out.println("Original linked_li: " + linked_list);

        System.out.println("********************************************");


        System.out.println("Convert a lined linked_li to array linked_li");

        List<String> list2 = new ArrayList<>(linked_list);

        System.out.println("Arary list: " + list2);

        for (String s : list2) {
            System.out.println(s);
        }

        System.out.println("********************************************");

        System.out.println("First element of array list: " + list2.getFirst());
        
    }
    
    
    
}
