package com.ufukucar;

import java.util.Scanner;
import java.util.Stack;

public class _004_Palindrome_Kontrol {

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

        System.out.println("Bir kelikekme yazınız: ");
        String kelime = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char c : kelime.toCharArray()) {
            stack.push(c);
        }

        StringBuilder rev = new StringBuilder();

        while ( !stack.isEmpty() ) {
            rev.append(stack.pop());
        }

        if ( kelime.equals(rev.toString()) ) {
            System.out.println(kelime + " bir palindrome'dur.");
        }else {
            System.out.println(kelime + " bir palindrome değildir");
        }


    }
}
