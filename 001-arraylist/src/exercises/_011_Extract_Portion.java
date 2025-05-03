package exercises;

import java.util.ArrayList;
import java.util.List;

public class _011_Extract_Portion {

    public static void main(String[] args) {


        List<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");
        list1.add("E");
        list1.add("F");
        list1.add("G");
        list1.add("H");

        System.out.println("List 1: " + list1);


        List<String> subList = list1.subList(0, 3);

        System.out.println("Sub list: " + subList);

    }


}
