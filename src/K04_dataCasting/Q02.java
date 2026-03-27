package K04_dataCasting;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        // Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Double giriniz: ");
        double number1 = scanner.nextDouble();

        System.out.println("Int giriniz: ");
        int number2 = scanner.nextInt();

        double sum = number1 + number2;
        double product = number1 * number2;

        System.out.println("Toplam: " + sum + "\nCarpim: " + product);
    }
}