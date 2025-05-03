package exercises;

import java.util.ArrayList;
import java.util.List;

public class _008_Retrive_Element {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Blue");
        list1.add("Green");
        list1.add("Yellow");


        System.out.println("First Element get(0): " + list1.get(0));

        System.out.println("First Element getFirst(): " + list1.getFirst());


        System.out.println("Last Element get(list1.size() -1): " + list1.get(list1.size() -1));
        System.out.println("Last Element getLast(): " + list1.getLast());

        System.out.println("Get 2. element: " + list1.get(1));


    }


}
