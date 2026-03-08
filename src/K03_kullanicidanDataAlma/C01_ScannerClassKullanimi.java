package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C01_ScannerClassKullanimi {

    public static void main(String[] args) {

        // Kullanicidan bir double, bir de int sayi alip
        // bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ondalikli sayi giriniz: ");
        double ondalikliSayi = scanner.nextDouble();

        System.out.println("Tamsayi giriniz: ");
        int tamSayi = scanner.nextInt();

        System.out.println("Toplam: " + (ondalikliSayi + tamSayi));
        System.out.println("Carpim: " + (ondalikliSayi * tamSayi));
    }
}
