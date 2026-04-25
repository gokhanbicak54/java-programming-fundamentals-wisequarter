package K19_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {

        // Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        // elemanlardan  sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.

        int[] arr = {4, 2, 1, 2, 3, 3, 3, 2, 1, 5, 6, 5};

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int each : arr) {
            if (!tekrarsizList.contains(each)) {
                tekrarsizList.add(each);
            }
        }

        Collections.sort(tekrarsizList);

        arr = new int[tekrarsizList.size()];

        for (int i = 0; i < tekrarsizList.size(); i++) {
            arr[i] = tekrarsizList.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }
}