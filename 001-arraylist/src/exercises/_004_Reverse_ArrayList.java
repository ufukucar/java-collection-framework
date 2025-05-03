package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _004_Reverse_ArrayList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(3);

        list.add("C++");
        list.add("Java");
        list.add("PHP");
        list.add("Pyton");
        list.add("C#");

        System.out.println("list: " + list);


        System.out.println("Reversed ArrayList:");
        Collections.reverse(list);
        System.out.println(list);


    }


}
