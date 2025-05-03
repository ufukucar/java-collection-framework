package exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class _001_BaskaBirArrayListtekiVerileriKopyalama2 {


    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);


        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        System.out.println("\n**************************************");
        Collections.copy(list1, list2);
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);


    }

}
