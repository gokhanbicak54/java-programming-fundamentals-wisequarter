package K17_arrays.D01_arrayOlusturmaVeKullanma;

import java.util.Arrays;

public class Q03 {

    public static void main(String[] args) {

        // Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
        // basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        // Orn :  input : [4,5,6,7]   array’in son hali. : [7,4,5,6]

        int[] arr = {1, 2, 3, 4, 5};

        arr = methodKaydirma(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] methodKaydirma(int[] arr) {

        int lastIndex = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = lastIndex;

        return arr;
    }
}