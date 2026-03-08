package K05_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        // Kullanicidan 3 basamakli pozitif bir tamsayi isteyin
        // sayinin rakamlar toplamini bulun
        // ornek input = 245  ise output = 11

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayi giriniz: ");
        int sayi = scanner.nextInt(); // 245

        int toplam = 0;

        toplam = sayi % 10;
        sayi = sayi / 10;

        toplam += sayi % 10;
        sayi = sayi / 10;

        toplam += sayi % 10;

        System.out.println("Girilen sayinin rakamlar toplami: " + toplam);
    }
}