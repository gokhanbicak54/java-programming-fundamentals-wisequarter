package K19_forEachLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q05 {

    public static void main(String[] args) {

        // Verilen iki array’in elementlerini karsilastirip,
        // ikisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin.

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {3, 9, 8, 7, 6, 5, 4};

        List<Integer> ortakList = new ArrayList<>();

        for (int sayi1 : arr1) {
            for (int sayi2 : arr2) {
                if (sayi1 == sayi2) {
                    if (!ortakList.contains(sayi1)) {
                        ortakList.add(sayi1);
                    }
                }
            }
        }

        Collections.sort(ortakList);
        System.out.println(ortakList);
    }
}