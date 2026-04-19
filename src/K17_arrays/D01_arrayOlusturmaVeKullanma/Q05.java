package K17_arrays.D01_arrayOlusturmaVeKullanma;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {

        // Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan
        // ve bize donduren bir method olusturun.

        System.out.println(Arrays.toString(arrayOlusturma()));
    }

    public static int[] arrayOlusturma() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Array'in uzunlugu: ");
        int arrayLength = scanner.nextInt();

        int[] arr = new int[arrayLength];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array elamanı: ");
            arr[i] = scanner.nextInt();
        }

        return arr;
    }
}