package exercises;

import java.util.ArrayList;
import java.util.List;

public class _006_Join_2_ArrayList {


    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();

        list1.add("Laptop");
        list1.add("Keyboard");
        list1.add("Mouse");
        list1.add("CPU");

        System.out.println("list1: " + list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Printer");
        list2.add("Derive");

        System.out.println("list2: " + list2);

        System.out.println("After join 2 array list");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println("Join 2 array list: " + list3);



    }


}
