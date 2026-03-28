package K08_ifElseStatements.D02_ifElseStatements;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {

        // Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yas: ");
        double age = scanner.nextDouble();

        if (age >= 65) {
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println((65 - age) + " yil daha beklemelisin");
        }
    }
}