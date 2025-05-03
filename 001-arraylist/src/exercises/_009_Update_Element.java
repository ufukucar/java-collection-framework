package exercises;

import java.util.ArrayList;
import java.util.List;

public class _009_Update_Element {


    public static void main(String[] args) {

        List list1 = new ArrayList();

        list1.add("Black");
        list1.add("Blue");
        list1.add("Green");
        list1.add("Red");
        list1.add("Yellow");

        System.out.println("ArrayList: " + list1);

        list1.set(0, "Gray");
        System.out.println("ArrayList after update first element : " + list1);




    }


}
