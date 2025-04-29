import java.util.ArrayList;
import java.util.List;

public class _002_ArrayListForEachKullanimi {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Mercedes");
        list.add("Honda");
        list.add("Toyota");
        list.add("Opel");

        for (String str : list) {
            System.out.println(str);
        }


    }

}
