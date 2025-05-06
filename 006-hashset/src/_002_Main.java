import java.util.HashSet;

public class _002_Main {

    public static void main(String[] args) {


        HashSet<_002_Personel> set = new HashSet<>();

        set.add(new _002_Personel(100, "John"));
        set.add(new _002_Personel(101, "Smith"));
        set.add(new _002_Personel(102, "Mike"));


        for (_002_Personel personel : set) {
            System.out.println(personel);
        }

        System.out.println("***********************************************");

        _002_Personel p1 = new _002_Personel(101, "");

        if ( set.contains(p1) ) {
            System.out.println("Personel mevcut!");
        }else {
            System.out.println("Personel yok!");
        }

        System.out.println("***********************************************");

        for ( _002_Personel p: set) {
            if ( p.equals(p1) ) {
                System.out.println(p);
            }
        }


    }

}
