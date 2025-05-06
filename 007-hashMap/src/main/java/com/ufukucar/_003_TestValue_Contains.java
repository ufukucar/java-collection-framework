package com.ufukucar;

import java.util.HashMap;

public class _003_TestValue_Contains {

    public static void main(String[] args) {


        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Red");
        hashMap.put(2, "Green");
        hashMap.put(3, "Blue");
        hashMap.put(4, "Yellow");
        hashMap.put(5, "Orange");
        hashMap.put(6, "Violet");
        hashMap.put(7, "Pink");
        hashMap.put(8, "Gold");
        hashMap.put(9, "Silver");
        hashMap.put(10, "Golden");

        System.out.println("hashMap: " + hashMap);

        System.out.println("************************************");

        if  ( hashMap.containsKey(1) ) {
            System.out.println("containsKey: 1 true döndü: " + hashMap.get(1));
        }

        if ( hashMap.containsValue("Golden") ) {
            System.out.println("containsValue: Golden");
        }else {
            System.out.println("Golden doesn't exist");
        }

    }
}
