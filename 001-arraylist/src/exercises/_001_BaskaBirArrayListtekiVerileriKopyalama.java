package exercises;

import java.util.ArrayList;
import java.util.List;

public class _001_BaskaBirArrayListtekiVerileriKopyalama {


    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        System.out.print("List1 => ");
        for (Integer i : list1) {
            System.out.print(i + ", ");
        }
        System.out.println("\n************************************");

        System.out.println("List1 dizisi, List2 ye kopyalanıyor....");
        List<Integer> list2 = new ArrayList<>(list1);
        System.out.print("List2 => ");
        for (Integer i : list2) {
            System.out.print(i + ", ");
        }
        System.out.println("\n************************************");

        System.out.println("addAll() metodu tümünü kopyalar....");
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(list1);
        System.out.print("List3 => ");
        for (Integer i : list3) {
            System.out.print(i + ", ");
        }
        System.out.println("\n************************************");




    }

}
