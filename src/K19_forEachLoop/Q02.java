package K19_forEachLoop;

public class Q02 {

    public static void main(String[] args) {

        // Verilen int array’deki her elementin karelerini alip,
        // karelerinin toplamini yazdiran bir method olusturun.

        int[] arr = {1, 2, 3, 4, 5, 6, 3};

        karelerToplami(arr);
    }

    public static void karelerToplami(int[] array) {

        int sum = 0;

        for (int each : array) {
            sum += each * each;
        }

        System.out.println("Toplam: " + sum);
    }
}