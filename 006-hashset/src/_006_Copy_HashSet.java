import java.util.HashSet;

public class _006_Copy_HashSet {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("Mercedes");
        hs.add("BMW");
        hs.add("Opel");

        System.out.println("hs: " + hs);

        HashSet<String> hs2 = new HashSet<>();

        hs2.addAll(hs);

        System.out.println("hs2: " + hs2);


    }

}
