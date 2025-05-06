import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class _004_HashSeti_ArrayListe_Cevirme {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("Black");
        set.add("White");
        set.add("Pink");
        set.add("Red");
        set.add("Green");
        set.add("Yellow");
        System.out.println("HashSet : " + set);

        //Convert HashSet to ArrayList
        List<String> res = new ArrayList<>(set);

        System.out.println("ArrayList : " + res);
    }
}
