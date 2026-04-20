package K17_arrays.D03_multiDimensionalArrays;

public class Q04 {

    public static void main(String[] args) {

        // Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir method olusturun.

        int[][] arr = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};

        long result = carpimArrayElemanlari(arr);

        System.out.println("Sonuc: " + result); // 3628800
    }

    public static long carpimArrayElemanlari(int[][] arr) {

        long carpim = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                carpim *= arr[i][j];
            }
        }

        return carpim;
    }
}