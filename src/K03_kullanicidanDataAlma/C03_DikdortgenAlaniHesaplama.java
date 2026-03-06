package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C03_DikdortgenAlaniHesaplama {

    public static void main(String[] args) {

        // Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        // dikdortgenin alanini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. kenari giriniz: ");
        double edge1 = scanner.nextDouble();

        System.out.println("2. kenari giriniz: ");
        double edge2 = scanner.nextDouble();

        System.out.println("Alan: " + (edge1 * edge2));
    }
}
