package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _003_Shuffle_ArrayList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Black");
        list.add("Blue");
        list.add("Green");
        list.add("Orange");
        list.add("Pink");
        list.add("Purple");
        list.add("White");
        list.add("Yellow");


        System.out.println("Before Shuffling ArrayList: " + list);

        Collections.shuffle(list);

        System.out.println("After Shuffling ArrayList: " + list);



    }
}
