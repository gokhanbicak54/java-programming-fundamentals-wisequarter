package K08_ifElseStatements.D04_nestedIfElseStatements;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        // Kullanicidan bir sayi alin. Sayi tek ise negatif veya pozitif tek sayi oldugunu yazdirin,
        // sayi cift sayi ise 10’un tam kati olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi: ");
        int number = scanner.nextInt();

        if (number % 2 != 0) {
            if (number < 0) {
                System.out.println("Tek ve negatif");
            } else {
                System.out.println("Tek ve pozitif");
            }
        } else {
            if (number % 10 == 0) {
                System.out.println("Cift ve 10'un kati");
            } else {
                System.out.println("Cift ve 10'un kati degil");
            }
        }
    }
}