import java.util.ArrayList;
import java.util.List;

public class _001_ArrayListSinifiVeOzellikleri {
    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Ali");
        arrayList.add("Veli");
        arrayList.add("Ayşe");

        /*for ( int i = 0; i < arrayList.size(); i++ ) {
            System.out.println( arrayList.get(i));
        }*/

        /*
        System.out.println("---------------------- List interfacei kullanılarak ----------------------");
        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Ali");
        arrayList2.add("Veli");
        arrayList.add("Ayşe");

        for ( int i = 0; i < arrayList.size(); i++ ) {
            System.out.println( arrayList.get(i));
        }
        System.out.println("---------------------- #List interfacei kullanılarak ----------------------");
        */

        System.out.println("**************  Tüm elemanlar ************** ");
        for ( String s : arrayList ) {
            System.out.println(s);
        }

        System.out.println("************** Veri silme ************** ");
        arrayList.remove("Veli");
        System.out.println("Silme işlemi sonrası");
        for ( String s : arrayList ) {
            System.out.println(s);
        }

        System.out.println("arraylist boyutu: " + arrayList.size());

        System.out.println("**************  contains kullanımı ************** ");
        if ( arrayList.contains("Veli") ) {
            System.out.println("Veli mevcut");
        }else{
            System.out.println("Veli mevcut değil");
        }

        System.out.println("**************  contains kullanımı ************** ");



    }
}