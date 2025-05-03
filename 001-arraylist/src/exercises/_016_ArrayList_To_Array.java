package exercises;

import java.util.ArrayList;

public class _016_ArrayList_To_Array {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Papaya");
        list.add("Mulberry");
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Watermelon");
        System.out.println("ArrayList : "+list);
        System.out.println("\nConvert an ArrayList to Array ..");

        Object[] arr = list.toArray();

        System.out.println("Array: " + arr.toString());

        for ( Object obj : arr) {
            System.out.print(obj + ", ");
        }








    }



}
