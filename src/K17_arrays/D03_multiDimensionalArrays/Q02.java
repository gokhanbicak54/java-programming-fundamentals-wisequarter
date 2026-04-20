package K17_arrays.D03_multiDimensionalArrays;

import java.util.Arrays;

public class Q02 {

    public static void main(String[] args) {

        // Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip,
        // yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        // input: int[][] arr =  {{3, 4, 5}, {2, 3, 6, 7}};
        // output: [5, 7, 11]

        int[][] arr =  {{3, 4, 5}, {2, 3, 6, 7}};

        int ortakIndexSayisi = (arr[0].length > arr[1].length ? arr[1].length : arr[0].length);

        int[] ortakArr = new int[ortakIndexSayisi];

        for (int i = 0; i < ortakIndexSayisi; i++) {

            ortakArr[i] = arr[0][i] + arr[1][i];
        }

        System.out.println("Array: " + Arrays.toString(ortakArr)); // [5, 7, 11]
    }
}