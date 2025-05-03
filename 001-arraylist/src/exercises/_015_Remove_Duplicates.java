package exercises;

import java.util.*;

public class _015_Remove_Duplicates {


    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(2);

        System.out.println("List: " + list);

        Set<Integer> set = new LinkedHashSet<>(list);

        list.clear();

        list.addAll(set);

        System.out.println("Without duplicate of list: " + list);




    }


}
