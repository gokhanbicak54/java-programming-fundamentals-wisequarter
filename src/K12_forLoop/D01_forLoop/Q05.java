package K12_forLoop.D01_forLoop;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {

        // Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("20'den kucuk sayi girin: ");
        int number = scanner.nextInt();

        int fakNumber = 1;

        if (number < 0 || number >= 20) {
            System.out.println("Yanlis sayi girdiniz");
        } else {
            for (int i = 1; i <= number; i++) {
                fakNumber *= i;
            }
            System.out.println(number + " sayisinin faktoriyeli: " + fakNumber);
        }
    }
}