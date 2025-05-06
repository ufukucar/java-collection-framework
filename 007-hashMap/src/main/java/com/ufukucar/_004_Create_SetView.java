package com.ufukucar;

import java.util.HashMap;
import java.util.Set;

public class _004_Create_SetView {

    public static void main(String args[])
    {
        HashMap<Integer, String> hash_map = new HashMap <Integer, String> ();
        hash_map.put(1, "Red");
        hash_map.put(2, "Yellow");
        hash_map.put(3, "Black");
        hash_map.put(4, "Pink");
        hash_map.put(5, "Orange");
        hash_map.put(6, "Blue");

        Set set = hash_map.entrySet();// create set view

        System.out.println("Set values : " + set);// check set values
    }

}
