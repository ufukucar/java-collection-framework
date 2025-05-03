package exercises;

import java.util.ArrayList;
import java.util.List;

public class _010_Search_Element {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Yellow");
        list.add("Gray");
        list.add("Black");
        list.add("Blue");
        list.add("Red");

        if ( list.contains("Yellow")) {
            System.out.println("Yellow found");
        }else {
            System.out.println("Yellow not found");
        }

        List <Double> numbers = new ArrayList<>();

        numbers.add(1.0);
        numbers.add(2.3);
        numbers.add(3.21);
        numbers.add(4.543);
        numbers.add(5.15);

        if ( numbers.contains(3.221) )
            System.out.println("3.221 found");
        else
            System.out.println("3.221 not found");


    }


}
