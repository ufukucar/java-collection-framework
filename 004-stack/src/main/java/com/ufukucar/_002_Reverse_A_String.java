package com.ufukucar;

import java.util.Scanner;
import java.util.Stack;

public class _002_Reverse_A_String {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Bir şey yazınız:");
        String sey = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (char c : sey.toCharArray()) {
            stack.push(c);
        }


        System.out.println("Girdiğiniz yazı tersten yazdırılıyor.... \n");
        while ( !stack.isEmpty() ) {
            System.out.print(stack.pop());
        }





    }


}
