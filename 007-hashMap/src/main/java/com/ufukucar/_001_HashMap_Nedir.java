package com.ufukucar;

import java.util.HashMap;
import java.util.Map;

public class _001_HashMap_Nedir {

    public static void main(String[] args) {

        System.out.println("KEY -> VALUE ");
        System.out.println("*****************************************\n");


        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Ali", 57);
        hashMap.put("Veli", 78);
        hashMap.put("Osman", 62);


        System.out.println("hashMap: " + hashMap);

        System.out.println(hashMap.get("Ali"));
        System.out.println(hashMap.get("Veli"));
        System.out.println(hashMap.get("Osman"));

        System.out.println("*********************************************");

        System.out.println("Iterate etmek için: ");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("*********************************************");



    }
}