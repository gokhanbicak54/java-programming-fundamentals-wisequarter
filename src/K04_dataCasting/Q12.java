package K04_dataCasting;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {

        // Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun
        // ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi1: ");
        double number1 = scanner.nextDouble();

        System.out.println("Sayi2: ");
        double number2 = scanner.nextDouble();

        int result = (int) (number1 / number2);

        System.out.println("Sonuc: " + result);
    }
}