package K17_arrays.D01_arrayOlusturmaVeKullanma;

import java.util.Arrays;

public class Q01 {

    public static void main(String[] args) {

        // Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]

        arr = arttirmaMethod(arr, 2);

        System.out.println(Arrays.toString(arr)); // [3, 4, 5, 6, 7]
    }

    public static int[] arttirmaMethod(int[] arr, int artisMiktari) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] += artisMiktari;
        }

        return arr;
    }
}