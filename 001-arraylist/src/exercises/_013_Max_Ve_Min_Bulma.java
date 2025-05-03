package exercises;

import java.util.ArrayList;
import java.util.Collections;

public class _013_Max_Ve_Min_Bulma {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int max = Collections.max(list);
        int max2 = list.stream().max(Integer::compareTo).get();
        Object max3 = Collections.max(list);


        System.out.println("max ve max2: " + max + "," + max2);
        System.out.println("Max 3: " + max3);

        int min = Collections.min(list);
        int min2 = list.stream().min(Integer::compareTo).get();
        Object min3 = Collections.min(list);

        System.out.println("min ve min2: " + min + "," + min2);
        System.out.println("Min 3: " + min3);

        System.out.println("*********************************");

        ArrayList<String> list_str = new ArrayList<>();
        list_str.add("Blue");
        list_str.add("Orange");
        list_str.add("Pink");
        list_str.add("Gold");
        list_str.add("Brown");
        list_str.add("Red");

        System.out.println("Given Array List : " + list_str);

        Object max_str = Collections.max(list_str);
        System.out.println("max_str: " + max_str);





    }


}
