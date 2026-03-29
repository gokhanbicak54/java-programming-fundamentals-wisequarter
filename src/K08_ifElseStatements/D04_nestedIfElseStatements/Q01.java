package K08_ifElseStatements.D04_nestedIfElseStatements;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cinsiyet: ");
        char gender = scanner.next().toUpperCase().charAt(0);

        System.out.println("Yas: ");
        int age = scanner.nextInt();

        if (gender == 'K') {
            if (age >= 60) {
                System.out.println("Emekli olabilirsin");
            } else if (age >= 18) {
                System.out.println("Emekli olmak icin " + (60 - age) + " yil daha calisman gerekir");
            }
            else {
                System.out.println("Emeklilik kontrol edilemez");
            }
        } else if (gender == 'E') {
            if (age >= 65) {
                System.out.println("Emekli olabilirsin");
            } else if (age >= 18) {
                System.out.println("Emekli olmak icin " + (65 - age) + " yil daha calisman gerekir");
            }
            else {
                System.out.println("Emeklilik kontrol edilemez");
            }
        } else {
            System.out.println("Cinsiyeti yanlış girdiniz");
        }
    }
}