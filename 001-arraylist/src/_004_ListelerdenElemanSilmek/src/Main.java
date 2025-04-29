package _004_ListelerdenElemanSilmek.src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Personel> list = new ArrayList<Personel>();

        list.add(new Personel(100, "Necip"));
        list.add(new Personel(101, "Ayşe"));
        list.add(new Personel(102, "Zeliha"));
        list.add(new Personel(103, "Muammer"));

        System.out.println(list);

        for (Iterator iterator = list.iterator(); iterator.hasNext();) {

            Personel p = (Personel) iterator.next();

            if (p.getName().equals("Muammer")) {
                iterator.remove();
            }
        }

        System.out.println(list);

        Iterator<Personel> iterator = list.iterator();

        while (iterator.hasNext()) {
            Personel p = (Personel) iterator.next();
            if (p.getName().equals("Zeliha")) {
                iterator.remove();
            }
        }

        System.out.println(list);



    }


}
