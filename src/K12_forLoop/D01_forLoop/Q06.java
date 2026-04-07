package K12_forLoop.D01_forLoop;

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {

        // Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        // Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("20'den kucuk sayi girin: ");
        int number = scanner.nextInt();

        int fakNumber = 1;

        if (number < 0 || number >= 20) {
            System.out.println("Yanlis sayi girdiniz");
        } else {
            System.out.print(number + "! = ");

            for (int i = number; i >= 2; i--) {
                fakNumber *= i;
                System.out.print(i + " * ");
            }
            System.out.println("1 = " + fakNumber);
        }
    }
}