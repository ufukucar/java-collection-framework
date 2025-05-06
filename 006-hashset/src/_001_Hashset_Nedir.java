import java.util.HashSet;

public class _001_Hashset_Nedir {

    public static void main(String[] args) {

        System.out.println("****************** HASHSET ******************");
        System.out.println("\n Veriler sıralı bir şekilde tutulmaz. \n");

        HashSet<String> set = new HashSet<>();

        set.add("Mercedes");
        set.add("BMW");
        set.add("Ford");
        set.add("Honda");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("*******************************************");

        if ( set.contains("Mercedes") ) {
            System.out.println("Mercedes bulunuyor...");
        }
        else {
            System.out.println("Mercedes bulunmuyor...");
        }

        System.out.println("*******************************************");


        System.out.println("Hashset ler farkı bulma");
        HashSet<String> set2 = new HashSet<>();
        set2.add("Toyota");
        set2.add("Audi");
        set2.add("Opel");


        // set2 nin set1 den farkı
        HashSet<String> difference = new HashSet<>(set2);

        difference.removeAll(set); // set2'nin içinde set in elemanlarını siler

        System.out.println("FARKLAR NELERDIR...");
        for ( String s : difference ) {
            System.out.println(s);
        }
        System.out.println("*******************************************");

        System.out.println("set2 nin tüm elemanlarını silme");

        set2.clear();
        System.out.println("set2: " + set2);

    }
}