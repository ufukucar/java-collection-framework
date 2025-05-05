package com.ufukucar;

import java.util.Stack;

public class _003_Parantez_Kontrol {

    public static void main(String[] args) {

        String input = "(([{()}]))";

        Stack<Character> stack = new Stack<>();

        boolean isBalanced = true;

        for (char c : input.toCharArray()) {

            if ( c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            else if ( c == ')' || c == '}' || c == ']' ) {

                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{'))
                {
                    isBalanced = false;
                    break;
                }
            }
        }

        System.out.println("Parantezler dengeli mi: " + isBalanced);

    }



}
