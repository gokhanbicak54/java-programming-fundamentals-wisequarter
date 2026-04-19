package K17_arrays.D01_arrayOlusturmaVeKullanma;

public class Q02 {

    public static void main(String[] args) {

        // Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.

        int[] arr = {1, 2, -3, -4, 54, -6};

        System.out.println("Pozitif sayilarin toplami: " + pozitifToplam(arr));
    }

    public static int pozitifToplam(int[] arr) {

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                toplam += arr[i];
            }
        }

        return toplam;
    }
}