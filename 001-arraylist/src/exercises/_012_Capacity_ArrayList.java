package exercises;

import java.util.ArrayList;

public class _012_Capacity_ArrayList {

    public static void main(String[] args) {

        ArrayList<String> list_str= new ArrayList<String>();
        list_str.add("Printer");
        list_str.add("Derive");
        list_str.add("Monitor");
        list_str.add("Laptop");
        list_str.add("Keyboard");
        list_str.add("Mouse");
        list_str.add("CPU");
        System.out.println("Given Array List : " + list_str);
        System.out.println("Let trim to size the above array.. ");
        list_str.trimToSize();
        System.out.println(list_str);


        /*
            Bu metodun yaptığı:

            ArrayList içindeki öğe sayısı kadar bellek kullanılması sağlanır.

            Yani ArrayList'in kapasitesi ile gerçek öğe sayısı eşitlenir.

            Bu işlem, gereksiz belleği serbest bırakır.

            Örneğin, listeye 7 öğe eklendi ama arka planda kapasite 10 olabilir. trimToSize() çağrıldığında kapasite de 7 olur,
            böylece boşta kalan 3 öğelik yer temizlenmiş olur.

            Ne zaman kullanılır?

            Büyük listelerde, hafıza yönetimini iyileştirmek amacıyla kullanılır.

            Özellikle liste sabit hale geldikten sonra, başka öğe eklenmeyecekse belleği optimize etmek için çağrılır.
         */

    }

}
