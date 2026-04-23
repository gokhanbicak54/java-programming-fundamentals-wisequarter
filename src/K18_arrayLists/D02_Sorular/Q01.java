package K18_arrayLists.D02_Sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {

        // Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip,
        // tum elemanlardan  sadece 1 tane yapip bize dondurecek bir method olusturun.

        int[] arr = {2, 3, 4, 5, 2, 4, 2, 2, 4, 2, 4, 3, 5, 1};

        arr = tekrarsizYapanMethod(arr);
        System.out.println("Tekrarsiz Liste: " + Arrays.toString(arr)); // [1, 2, 3, 4, 5]
    }

    public static int[] tekrarsizYapanMethod(int[] arr) {

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizList.contains(arr[i])) {
                tekrarsizList.add(arr[i]);
            }
        }

        Collections.sort(tekrarsizList); // [1, 2, 3, 4, 5]

        arr = new int[tekrarsizList.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = tekrarsizList.get(i);
        }

        return arr;
    }
}