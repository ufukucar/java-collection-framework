package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _002_Sorting_ArrayList {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("Python");
        list.add("C");
        list.add("Php");
        list.add("Css");
        list.add("MySQL");
        list.add("C++");
        list.add("Java");
        list.add("HTML");
        list.add("Bootstrap");
        list.add("Flask");

        System.out.println(list);
        System.out.println("Sorting ArrayList:");
        Collections.sort(list);
        System.out.println(list);




    }



}
