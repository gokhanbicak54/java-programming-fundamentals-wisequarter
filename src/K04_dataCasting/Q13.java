package K04_dataCasting;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

        // Kullanicidan bir double, bir  tamsayi alin, double sayiyi ikinci sayiya bolun
        // ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Double sayi: ");
        double numberDouble = scanner.nextDouble();

        System.out.println("Int sayi: ");
        int numberInt = scanner.nextInt();

        int result = (int) (numberDouble / numberInt);

        System.out.println("Sonuc: " + result);
    }
}