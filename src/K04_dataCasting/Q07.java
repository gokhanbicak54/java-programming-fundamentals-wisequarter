package K04_dataCasting;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {

        // Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi1: ");
        int number1 = scanner.nextInt();

        System.out.println("Sayi2: ");
        int number2 = scanner.nextInt();

        int temp = number1;
        number1 = number2;
        number2 = temp;

        System.out.println("Sayi1: " + number1 + "\nSayi2: " + number2);
    }
}