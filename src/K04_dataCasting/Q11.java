package K04_dataCasting;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

        // Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin,
        // o sayiyi -128 ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayi: ");
        int number = scanner.nextInt();

        byte result = (byte) number;

        System.out.println("Sayi: " + result);
    }
}