package K18_arrayLists.D02_Sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q03 {

    public static void main(String[] args) {

        // Verilen String bir listede istenmeyen harf iceren elementleri silip,
        // kalan kismini list olarak bize donduren bir method olusturun

        List<String> isimler = new ArrayList<>(Arrays.asList("Ali", "Veli", "Cemil", "Ayse", "Fatma", "Hatice"));
        System.out.println(istenmeyeniSil(isimler, "i"));
    }

    public static List<String> istenmeyeniSil(List<String> isimler, String istenmeyenHarf) {

        for (int i = 0; i < isimler.size(); i++) {

            if (isimler.get(i).contains(istenmeyenHarf)) {
                isimler.remove(isimler.get(i));
                i--;
            }
        }

        return isimler;
    }
}