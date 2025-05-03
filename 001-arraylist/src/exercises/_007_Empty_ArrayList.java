package exercises;

import java.util.ArrayList;
import java.util.List;

public class _007_Empty_ArrayList {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add("Yellow");
        list1.add("Red");
        list1.add("Blue");
        list1.add("Green");

        System.out.println("list1: " + list1);

        list1.removeAll(list1);

        System.out.println("RemoveAll sonrası: " + list1);

        list1.add("Yellow");
        list1.add("Red");
        list1.add("Blue");
        list1.add("Green");


        list1.clear();
        System.out.println("Clear ArrayList: " + list1);




    }


}
