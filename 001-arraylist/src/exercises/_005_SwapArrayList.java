package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _005_SwapArrayList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Black");
        list.add("Orange");
        list.add("Pink");
        list.add("Blue");
        list.add("White");
        list.add("Yellow");

        System.out.println("Array List before Swap : " + list);

        Collections.swap(list, 0, 1);

        System.out.println("Array List after Swap : " + list);


    }

}
