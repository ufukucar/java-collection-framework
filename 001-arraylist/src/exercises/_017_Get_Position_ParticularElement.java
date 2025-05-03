package exercises;

import java.util.ArrayList;

public class _017_Get_Position_ParticularElement {


    public static void main(String[] args) {

        ArrayList<String> fru_list = new ArrayList<String>();
        fru_list.add("Pineapple");
        fru_list.add("Papaya");
        fru_list.add("Mango");
        fru_list.add("Apple");
        fru_list.add("Banana");
        fru_list.add("Cherry");
        fru_list.add("Watermelon");
        fru_list.add("Apple");

        System.out.println("Given ArrayList : "+fru_list);

        System.out.println("Watermelon Element Index of : "+fru_list.indexOf("Watermelon"));
        System.out.println("Pineapple Element Index of : "+fru_list.lastIndexOf("Pineapple"));
        System.out.println("First index of Element Apple : "+fru_list.indexOf("Apple"));
        System.out.println("Last index of Element Apple : "+fru_list.lastIndexOf("Apple"));
        System.out.println("Last index of Element Apple : "+fru_list.lastIndexOf("UFUK"));



    }


}
