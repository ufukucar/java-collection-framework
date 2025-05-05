package com.ufukucar;

import java.util.Stack;

public class _001_Stack_Nedir {
    public static void main(String[] args) {

        System.out.println("LIFO mantığında çalışır.\n");

        Stack<String> stack = new Stack<>();

        stack.add("Elma");
        stack.add("Muz");
        stack.add("Armut");

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());

        System.out.println("*****************************");

        System.out.println(stack.isEmpty());
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.isEmpty());

        System.out.println("*****************************");



    }
}