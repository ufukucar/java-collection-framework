package com.ufukucar;

import java.util.HashMap;

public class _002_Tekrar_Eden_Ilk_Ifadeyi_Bulma {

    public static Character tekrarlayanKarakteriBul (String s) {

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for ( int i = 0; i < s.length(); i++ ) {

            Character c = s.charAt(i);

            if ( hashMap.containsKey(c) ) {
                return c;
            }else {
                hashMap.put(c, 1);
            }

        }

        return null;
    }

    public static void main(String[] args) {


        String s = "asdfghgfs";

        System.out.println("Birden fazla tekrar eden karakter: " + tekrarlayanKarakteriBul(s));






    }



}
