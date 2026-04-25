package K19_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Q03 {

    public static void main(String[] args) {

        // Verilen String bir array’deki her bir elementi kontrol edip,
        // - Kelimenin uzunlugu cift sayi ise ilk yarisini
        // - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        // yeni bir listeye ekleyip yazdirin.

        String[] arr = {"ali", "veli", "ayse", "gokhan", "ozlem"};

        List<String> yeniList = new ArrayList<>();

        for (String each : arr) {

            int uzunluk = each.length();

            if (uzunluk % 2 == 0) {
                yeniList.add(each.substring(0, uzunluk / 2));
            } else {
                yeniList.add(each.substring(uzunluk / 2, uzunluk));
            }
        }

        System.out.println(yeniList);
    }
}