package K17_arrays.D01_arrayOlusturmaVeKullanma;

import java.util.Arrays;

public class Q07 {

    public static void main(String[] args) {

        // Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        // eski array’e yeni degeri atayin.

        int[] arr = {1, 2, 3, 4};
        int eklenecekSayi = 5;

        System.out.println(Arrays.toString(arr));

        arr = arrayElemanEkleme(arr, eklenecekSayi);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayElemanEkleme(int[] arr, int eklenecekSayi) {

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {

            newArr[i] = arr[i];
        }

        newArr[newArr.length - 1] = eklenecekSayi;

        return newArr;
    }
}