import java.util.HashSet;

public class _003_Ortak_Elemanlar_Harici_Sil {

    public static void main(String[] args) {

        System.out.println("retainAll() metodu, bir kümenin belirli bir koleksiyonla ortak olan elemanlarını tutmasını, geri kalan tüm elemanların silinmesini sağlar.");
        System.out.println("\n" +
                "İki küme arasında ortak elemanları bulmak istiyorsan.\n" +
                "Mevcut bir kümede sadece başka bir kümede de olan elemanları filtrelemek istiyorsan. \n");

        System.out.println("********************************************************");

        HashSet<String> set1 = new HashSet<>();
        set1.add("elma");
        set1.add("armut");
        set1.add("muz");

        HashSet<String> set2 = new HashSet<>();
        set2.add("armut");
        set2.add("çilek");
        set2.add("muz");

        set1.retainAll(set2);

        System.out.println(set1); // Çıktı: [armut]


    }


}
