package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C06_Swap {

    public static void main(String[] args) {

        // Kullanicidan iki sayi alip
        // ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayi1: ");
        int sayi1 = scanner.nextInt();

        System.out.println("Sayi2: ");
        int sayi2 = scanner.nextInt();

        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;

        System.out.println("Sayi1 yeni deger: " + sayi1);
        System.out.println("Sayi2 yeni deger: " + sayi2);
    }
}
