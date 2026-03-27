package K04_dataCasting;

import java.util.Scanner;

public class Q08 {

    public static void main(String[] args) {

        // Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi1: ");
        int number1 = scanner.nextInt();

        System.out.println("Sayi2: ");
        int number2 = scanner.nextInt();

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.println("Sayi1: " + number1 + "\nSayi2: " + number2);
    }
}