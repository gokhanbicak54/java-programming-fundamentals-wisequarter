package K17_arrays.D03_multiDimensionalArrays;

public class Q01 {

    public static void main(String[] args) {

        // Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir method olusturun.

        int[][] arr = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};

        ciftSayiToplami(arr);
    }

    public static void ciftSayiToplami(int[][] arr) {

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 == 0) {
                    toplam += arr[i][j];
                }
            }
        }

        System.out.println("Cift sayilarin toplami: " + toplam); // 30
    }
}